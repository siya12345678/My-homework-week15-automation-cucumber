package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "customer_firstname")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(id = "customer_lastname")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(id = "passwd")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(id = "address1")
    WebElement enterAddressLine1;

    @CacheLookup
    @FindBy(id = "city")
    WebElement enterCity;

    @CacheLookup
    @FindBy(id = "id_state")
    WebElement selectState;

    @CacheLookup
    @FindBy(id = "postcode")
    WebElement enterPostcode;

    @CacheLookup
    @FindBy(id = "id_country")
    WebElement selectCountry;

    @CacheLookup
    @FindBy(id = "phone_mobile")
    WebElement enterMobilePhone;

    @CacheLookup
    @FindBy(id = "alias")
    WebElement enterAddressAlias;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='navigation_page']")
    WebElement verifyMyAccount;

    public void firstName(String firstName) {
        sendTextToElement(enterFirstName, firstName);
        log.info("Enter First Name : " + firstName);
    }

    public void lastName(String lastName) {
        sendTextToElement(enterLastName, lastName);
        log.info("Enter Last Name :" + lastName);
    }

    public void password(String password) {
        sendTextToElement(enterPassword, password);
        log.info("Enter Password " + password);
    }


    public void addLine1(String addLn1) {
        sendTextToElement(enterAddressLine1, addLn1);
        log.info("Enter First Line of Address :" + addLn1);
    }

    public void city(String city) {
        sendTextToElement(enterCity, city);
        log.info("Enter City : " + city);
    }

    public void state(String state) {
        selectByVisibleTextFromDropDown(selectState, state);
        log.info("Enter State:" + state);
    }

    public void zipCd(String zipCd) {
        sendTextToElement(enterPostcode, zipCd);
        log.info("Enter PostCode" + zipCd);
    }

    public void country(String country) {
        selectByVisibleTextFromDropDown(selectCountry, country);
        log.info("Enter Country" + country);
    }

    public void mobilePhone(String mobileNb) {
        sendTextToElement(enterMobilePhone, mobileNb);
        log.info("Enter mobile phone" + mobileNb);
    }

    public void addAlias(String addAlias) {
        sendTextToElement(enterAddressAlias, addAlias);
        log.info("Enter Address alias" + addAlias);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("Click on Register button" + registerButton.toString());
    }

    public String verifyMyAccountText() {
        String txt = getTextFromElement(verifyMyAccount);
        log.info("Verify Account Page" + verifyMyAccount.toString());
        return txt;
    }
}



