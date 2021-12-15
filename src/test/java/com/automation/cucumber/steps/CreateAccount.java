package com.automation.cucumber.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.SignInPage;
import com.automation.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class CreateAccount extends Utility {
    @And("^I click on Create an Account Button$")
    public void iClickOnCreateAnAccountButton() {
    new SignInPage().setClickOnCreateAnAccount();
    }
    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterButton();
    }

    @Then("^Verify message \"([^\"]*)\"$")
    public void verifyMessage(String message ) {
        String actualMessage =  new CreateAccountPage().verifyMyAccountText();
        Assert.assertEquals("Error message displayed",message,actualMessage);
    }

    @And("^I enter email$")
    public void iEnterEmail() {
        new SignInPage().setClickOnCreateAnAccount("Robin"+currentTimeStamp()+"@gmail.com");
    }

    @And("^I enter FirstName \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName )  {
    new CreateAccountPage().firstName(firstName);
           }

    @And("^I enter LastName \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
        new CreateAccountPage().lastName(lastName);
   }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new CreateAccountPage().password(password);
   }



    @And("^I enter City \"([^\"]*)\"$")
    public void iEnterCity(String city )  {
        new CreateAccountPage().city(city);
    }

    @And("^I select state  \"([^\"]*)\"$")
    public void iSelectState(String state)  {
       new CreateAccountPage().state(state);
    }

    @And("^I enter zipcode \"([^\"]*)\"$")
    public void iEnterZipcode(String zipcode )  {
       new CreateAccountPage().zipCd(zipcode);
    }

    @And("^I enter Country \"([^\"]*)\"$")
    public void iEnterCountry(String country)  {
        new CreateAccountPage().country(country);
    }

    @And("^I enter Mobile number \"([^\"]*)\"$")
    public void iEnterMobileNumber(String mobile)  {
        new CreateAccountPage().mobilePhone(mobile);
    }

    @And("^I enter Address Alias \"([^\"]*)\"$")
    public void iEnterAddressAlias(String addAli)  {
    new CreateAccountPage().addAlias(addAli);
   }

    @And("^I enter Address line \"([^\"]*)\"$")
    public void iEnterAddressLine(String add1)  {
        new CreateAccountPage().addLine1(add1);
    }
}
