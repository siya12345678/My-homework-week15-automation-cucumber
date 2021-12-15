package com.automation.cucumber.steps;

import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class womenCatagoryPage {
    @Then("^I can verify \"([^\"]*)\" text on Screen\\.$")
    public void iCanVerifyTextOnScreen(String message) {
     String actualText =   new WomenCategoryPage().verifyWomenText();
        Assert.assertEquals("you are not on Women Page",message,actualText);
    }

    @And("^I Click on the product \"([^\"]*)\"$")
    public void iClickOnTheProduct(String product) {
        new WomenCategoryPage().setSelectProduct(product);
           }


    @And("^I change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qnty)  {
     new WomenCategoryPage().selectQty(qnty);
    }

    @And("^Select size \"([^\"]*)\"$")
    public void selectSize(String size)  {
     new WomenCategoryPage().setSelectSize(size);
    }

    @And("^Select colour \"([^\"]*)\"$")
    public void selectColour(String colour )  {
     new WomenCategoryPage().setSelectColour(colour);
    }

    @And("^Click on Add To Cart Button$")
    public void clickOnAddToCartButton() {
        new WomenCategoryPage().setAddToCartButton();
    }

    @And("^Popup will display$")
    public void popupWillDisplay() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Popup Message Displayed !");
    }

    @Then("^Verify the message \"([^\"]*)\"$")
    public void verifyTheMessage(String message )  {
    String actualText = new WomenCategoryPage().setConfirmationText();
    Assert.assertEquals("Message not Display",message,actualText);
    }

    @And("^Click on X button and close the popup$")
    public void clickOnXButtonAndCloseThePopup() {
        new WomenCategoryPage().setCloseWindow();
    }
}
