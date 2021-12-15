package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "email")
    WebElement clickOnEmail;
    @CacheLookup
    @FindBy(id = "passwd")
    WebElement clickOnPassword;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    WebElement clickOnSignInButton;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement clickOnCreateAnAccount;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement verifyAuthentication;
    @CacheLookup
    @FindBy(xpath = "button[id='SubmitCreate'] span")
    WebElement verifyCreateAnAccount;
    @CacheLookup
    @FindBy(id = "email_create")
    WebElement createNewEmail;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='alert alert-danger'])//ol//li")
    WebElement verifyAuthenticationFailedMessage;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement verifyLogOutLink;

    public void enterUsername(String userName) {

        sendTextToElement(clickOnEmail, userName);
        log.info("Enter EmailId " + userName);
    }
    public void enterPassword(String password) {
        sendTextToElement(clickOnPassword, password);
        log.info("Enter Pasword " + password);
    }
    public void setClickOnSignInButton(){
        clickOnElement(clickOnSignInButton);
        log.info("Click on Sign in button ");
    }

    public void setClickOnCreateAnAccount(String userName) {
        sendTextToElement(createNewEmail, userName);
        log.info("Enter EmailId " + userName);
    }
     public void setClickOnCreateAnAccount(){
        clickOnElement(clickOnCreateAnAccount);
        log.info("Click on Create an Account ");
    }

    public String verifyAuthenticationText() {

        String txt = getTextFromElement(verifyAuthentication);
        log.info("Verify Authentication Text "+verifyAuthentication.getText());
        return txt;
    }

    public String verifyCreateAnAccountText() {

        String txt = getTextFromElement(verifyCreateAnAccount);
        log.info("Verify Create an Account Text "+verifyCreateAnAccount.getText());
        return txt;
    }

    public String getVerifyAuthenticationFailedMessage() {
        String txt = getTextFromElement(verifyAuthenticationFailedMessage);
        log.info("Verify Authentication Failed Message "+verifyAuthenticationFailedMessage.getText());
        return txt;
    }

    public String verifyLogOutLink() {
        String txt = getTextFromElement(verifyLogOutLink);
        log.info("Verify Log Out "+ verifyLogOutLink.getText());
        return txt;
    }

    public void clickOnSignOut() {
        clickOnElement(verifyLogOutLink);
        log.info("Click on Logout Link");
    }


}
