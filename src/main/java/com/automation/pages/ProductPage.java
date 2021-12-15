package com.automation.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.drivermanager.ManageDriver.driver;

public class ProductPage {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }
        @CacheLookup
        @FindBy(xpath = "//a[@title='Women']")
        WebElement clickOnWomenLink;

}

