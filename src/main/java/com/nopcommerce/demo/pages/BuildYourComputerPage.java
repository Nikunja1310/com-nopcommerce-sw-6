package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourComputerPage.class.getName());
    public BuildYourComputerPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//button[normalize-space()='Add to cart'])[1]")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorLink;
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement RAMLink;
    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hddRadio;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement osLink;
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement checkboxLink1;
    @FindBy(id = "product_attribute_5_12")
    WebElement checkboxLink;
    @CacheLookup
    @FindBy(id = "price-value-1")
    WebElement priceLink;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement successMessageLink;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeLink;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    public WebElement shoppingCartLink;
    @FindBy(xpath = "(//button[normalize-space()='Go to cart'])[1]")
    WebElement goToCartLink;

    public void addToCart(){
        clickOnElement(addToCartButton);
        log.info("Click on " + addToCartButton.toString());
    }

    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCartLink);
        log.info("Mouse Hover on " + shoppingCartLink.toString());
    }
    public void selectProcessor(String value){
        selectByValueFromDropDown(processorLink,value);
        log.info("Select " + processorLink.toString());
    }
    public void selectRAM(String value){
        selectByVisibleTextFromDropDown(RAMLink,value);
        log.info("Select " + RAMLink.toString());
    }
    public void selectHddRadio(){
        clickOnElement(hddRadio);
        log.info("Select " + hddRadio.toString());
    }
    public void selectOs(){
        clickOnElement(osLink);
        log.info("Select " + osLink.toString());
    }
    public void selectCheckBox(){
        clickOnElement(checkboxLink);
        log.info("Select " + checkboxLink.toString());
    }
    public void selectCheckBox1(){
        clickOnElement(checkboxLink1);
        log.info("Select " + checkboxLink1.toString());
    }
    public String getPrice(){
        log.info("Get price " + priceLink.toString());
        return getTextFromElement(priceLink);
    }
    public String getSuccessMessage(){
        log.info("Get message " + successMessageLink.toString());
        return getTextFromElement(successMessageLink);
    }
    public void closeMessage(){
        clickOnElement(closeLink);
        log.info("Click on " + closeLink.toString());
    }
    public void clickOnGoToCart(){
        clickOnElement(goToCartLink);
        log.info("Click on " + goToCartLink.toString());
    }
}
