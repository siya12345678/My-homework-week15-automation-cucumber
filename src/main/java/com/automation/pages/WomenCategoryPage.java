package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenCategoryPage.class.getName());
 public WomenCategoryPage(){
     PageFactory.initElements(driver,this);}

     @CacheLookup
     @FindBy(xpath = "//h2[normalize-space()='Women']")
     WebElement verifyWomenWord;
     @CacheLookup
     @FindBy(xpath = "//a[@class='subcategory-name'][normalize-space()='Tops']")
     WebElement topsLink;
     @CacheLookup
     @FindBy(xpath = "//a[@class='subcategory-name'][normalize-space()='Dresses']")
     WebElement dressesLink;
     @CacheLookup
     @FindBy(id = "selectProductSort")
     WebElement selectProductSort;
     @CacheLookup
     @FindBy(xpath = "//i[@class='icon-th-list']")
     WebElement selectListView;
     @CacheLookup
     @FindBy(id = "center_column")
     WebElement selectProduct;
     @CacheLookup
     @FindBy(id = "group_1")
     WebElement selectSize;
     @CacheLookup
     @FindBy(xpath = "//span[normalize-space()='Add to cart']")
     WebElement addToCartButton;
     @CacheLookup
     @FindBy(xpath = "(//h2[normalize-space()='Product successfully added to your shopping cart'])[1]")
     WebElement confirmationText;
     @CacheLookup
     @FindBy(xpath = "//span[@title='Close window']")
     WebElement closeWindow;


    public String verifyWomenText() {
        String txt = getTextFromElement(verifyWomenWord);
        log.info("Verify Women Page : "+ verifyWomenWord.getText());
        return txt;
    }
    public void setSelectProductSort(String productSortby) {
        selectByVisibleTextFromDropDown(selectProductSort, productSortby);
        log.info("select "+productSortby+" form DropDown Box");
    }
    public void setSelectProduct(String product) {

        clickOnElement(By.xpath("//a[normalize-space()='"+product+"']"));
        log.info("Select Product : "+product);
    }

    public void selectQty(String quantity) {
        doubleClickAndSendKeysOnElement(By.xpath("//input[@id='quantity_wanted']"), quantity);
        log.info("Select Quantity : "+quantity);
            }

    public void setSelectSize(String size) {
        selectByVisibleTextFromDropDown(selectSize, size);
        log.info("Select Size:"+size);
    }

    public void setSelectColour(String colour) {
        clickOnElement(By.xpath("//a[@title='" + colour + "']"));
        log.info("Select Color" +colour);
    }
    public void setAddToCartButton(){
        clickOnElement(addToCartButton);
        log.info("Add to cart "+addToCartButton.getText());
    }
    public String setConfirmationText(){
        String txt = getTextFromElement(confirmationText);
        log.info("Get Confirmation :"+ confirmationText.getText());
        return txt;
    }
    public void setCloseWindow(){
        clickOnElement(closeWindow);
        log.info("Closing Window " +closeWindow.getText());

    }

}




