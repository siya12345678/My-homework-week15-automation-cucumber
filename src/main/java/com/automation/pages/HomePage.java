package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@title='Women']")
    WebElement clickOnWomenLink;

    @CacheLookup
    @FindBy(xpath = "(//a[@title='Dresses'][normalize-space()='Dresses'])[1]")
    WebElement clickOnDressesLink;

    @CacheLookup
    @FindBy(xpath = "(//a[@title='T-shirts'][normalize-space()='T-shirts'])[2]")
    WebElement clickOnTShirtsLink ;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement signInLink;

    @CacheLookup
    @FindBy(xpath ="//img[@alt='My Store']" )
    WebElement logoLink;

    public void setClickOnWomenLink(){
        log.info("Clicking on Women link " );
        clickOnElement(clickOnWomenLink);
        }
    public void setClickOnSignInLink() {
        log.info("Clicking on login link");
        clickOnElement(signInLink);
    }
    public String signButtonVerify(){
        String txt =getTextFromElement(signInLink);
        log.info("verify Sign in button: " + signInLink.toString());
        return txt;
    }
}



