package com.automation.cucumber.steps;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginTestPage {
    @Given("^I am on HomePage$")
    public void iAmOnHomePage() {
        System.out.println("I am On Login Page");
    }


    @When("^I Click on Sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().setClickOnSignInLink();
    }

    @Then("^I verify that \"([^\"]*)\" message is displayed$")
    public void iVerifyThatMessageIsDisplayed(String message)  {
       String actualMessage =  new SignInPage().verifyAuthenticationText();
        Assert.assertEquals("you are not on login page",message,actualMessage);
   }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
    new SignInPage().enterUsername(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new SignInPage().enterPassword(password);
    }

    @And("^I click on Sign In Button$")
    public void iClickOnSignInButton() {
        new HomePage().setClickOnSignInLink();
    }

    @Then("^I should see error message \"([^\"]*)\"$")
    public void iShouldSeeErrorMessage(String message) throws InterruptedException {
        Thread.sleep(2000);
        String actualMessage =  new SignInPage().getVerifyAuthenticationFailedMessage();
        Assert.assertEquals("Error message not displayed",message,actualMessage);
    }

    @Then("^Sign out link is displayed$")
    public void signOutLinkIsDisplayed() {
        String expectedText = "Sign out";
        String actualText = new SignInPage().verifyLogOutLink();
        Assert.assertEquals("Error message not displayed",expectedText,actualText);

    }

    @And("^I Click on Sign out Link$")
    public void iClickOnSignOutLink() {
        new SignInPage().clickOnSignOut();
    }

    @Then("^Sign In Link displayed$")
    public void signInLinkDisplayed() {
        String expectedText = "Sign in";
        String actualText = new HomePage().signButtonVerify();
        Assert.assertEquals("Error message not displayed",expectedText,actualText);
    }


    @When("^I click on Women Tab$")
    public void iClickOnWomenTab() {
    new HomePage().setClickOnWomenLink();
    }
}
