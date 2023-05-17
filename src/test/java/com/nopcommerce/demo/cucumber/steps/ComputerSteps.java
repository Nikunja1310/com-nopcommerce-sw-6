package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Nikunja A Senjalia
 */
public class ComputerSteps{
    @When("^I hover mouse on Computer from TopMenu$")
    public void iHoverMouseOnComputerFromTopMenu() {
        new TopMenu().mouseHoverOnComputer();
    }

    @And("^I select Desktops$")
    public void iSelectDesktops() {
        new TopMenu().selectMenu("Desktops");
    }

    @And("^I select \"([^\"]*)\" from dropdown$")
    public void iSelectFromDropdown(String value) throws InterruptedException {
        Thread.sleep(500);
        new ComputerPage().selectFromDropDown(value);
    }

    @Then("^I verify that the products are arranged in order dispalyed$")
    public void iVerifyThatTheProductsAreArrangedInOrderDispalyed() throws InterruptedException {
       Assert.assertEquals("Products are not sorted in reverse order",new ComputerPage().isSorted());
    }

    @And("^I click on Add To Cart$")
    public void iClickOnAddToCart() throws InterruptedException {
        Thread.sleep(500);
    new BuildYourComputerPage().addToCart();
    }

    @And("^I verify the Heading of the product$")
    public void iVerifyTheHeadingOfTheProduct() {
        Assert.assertEquals("Build your own computer",new TopMenu().getHeadingText());
    }

    @And("^I select processor$")
    public void iSelectProcessor() {
        new BuildYourComputerPage().selectProcessor("1");
    }

    @And("^I Select Ram$")
    public void iSelectRam() {
        new BuildYourComputerPage().selectRAM("8GB [+$60.00]");
    }

    @And("^I select Hdd Radio button$")
    public void iSelectHddRadioButton() {
        new BuildYourComputerPage().selectHddRadio();
    }


    @And("^I select OS$")
    public void iSelectOS() {
        new BuildYourComputerPage().selectOs();
    }


    @And("^I select Check box for following pages$")
    public void iSelectCheckBoxForFollowingPages() {
        new BuildYourComputerPage().selectCheckBox1();
        new BuildYourComputerPage().selectCheckBox();
        new BuildYourComputerPage().selectCheckBox1();
    }


    @And("^I verify the price is matching$")
    public void iVerifyThePriceIsMatching() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(new BuildYourComputerPage().getPrice(),"$1,475.00","Options not selected correctly");
    }

    @And("^I verify the product is added to shopping cart$")
    public void iVerifyTheProductIsAddedToShoppingCart() {
        Assert.assertEquals(new BuildYourComputerPage().getSuccessMessage(),"The product has been added to your shopping cart","Product is not added successfully");
    }

    @And("^I close the message$")
    public void iCloseTheMessage() {
        new BuildYourComputerPage().closeMessage();
    }

    @And("^I mouse hover to Shoppig cart$")
    public void iMouseHoverToShoppigCart() {
     new BuildYourComputerPage().mouseHoverOnShoppingCart();
    }

    @And("^I click on Go to Cart$")
    public void iClickOnGoToCart() {
        new BuildYourComputerPage().clickOnGoToCart();
    }

    @And("^I verify shopping cart$")
    public void iVerifyShoppingCart() {
        Assert.assertEquals("Shopping cart not displayed successfully","Shopping cart",new ShoppingCartPage().setShoppingCartText());
    }

    @And("^I change the Quantity to (\\d+)$")
    public void iChangeTheQuantityTo(int qty) {
        new ShoppingCartPage().changeQuantity("2");
    }

    @And("^I  update Cart$")
    public void iUpdateCart() {
        new ShoppingCartPage().updateCart();
    }

    @And("^I check if the cart is updated$")
    public void iCheckIfTheCartIsUpdated() {
        Assert.assertEquals(new ShoppingCartPage().getPrice(),"$2,950.00","Cart not updated");
    }

    @And("^I click on Terms and Conditions$")
    public void iClickOnTermsAndConditions() {
        new ShoppingCartPage().termsAndCondition();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new ShoppingCartPage().goCheckout();
    }

    @And("^I verify Heading Text of checkout navigation$")
    public void iVerifyHeadingTextOfCheckoutNavigation() {
        Assert.assertEquals(new TopMenu().getHeadingText(),"Welcome, Please Sign In!","Checkout navigation not succeed");
    }

    @And("^Click on Checkout as guest$")
    public void clickOnCheckoutAsGuest() {
        new RegisterPage().clickCheckoutAsGuest();
    }


    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
       new BillingPage().enterFirstname("Nirali");
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
    new BillingPage().enterLastname("Senjalia");
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
    new BillingPage().enterEmail("Nirali@gmail.com");
    }

    @And("^I select country \"([^\"]*)\"$")
    public void iSelectCountry(String country)  {
    new BillingPage().selectCountry("United Kingdom");
    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String city)  {
    new BillingPage().enterCity("London");
    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String firstName)  {
    new BillingPage().enterAddress("23, London road");
    }

    @And("^I enter postcode \"([^\"]*)\"$")
    public void iEnterPostcode(String postCode)  {
    new BillingPage().enterPostcode("UB123N");
    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phoneNumber)  {
    new BillingPage().enterPhoneNumber("7896541230");
    }

    @And("^I click on continue$")
    public void iClickOnContinue() {
        new BillingPage().clickOnContinue();
    }

    @And("^I select Shipping$")
    public void iSelectShipping() {
        new BillingPage().selectShipping();
    }

    @And("^I click on continue selecting shipping$")
    public void iClickOnContinueSelectingShipping() {
        new BillingPage().clickOnContinue();
    }

    @And("^I click on Credit Card$")
    public void iClickOnCreditCard() {
        new BillingPage().clickCreditCard();
    }

    @And("^I click on Payment continue$")
    public void iClickOnPaymentContinue() {
        new BillingPage().clickOnContinue();
    }

    @And("^I select payment method$")
    public void iSelectPaymentMethod() {
        new BillingPage().selectPaymentMethod();
    }

    @And("^I select card$")
    public void iSelectCard() {
        new BillingPage().selectCard(1);
    }

    @And("^I enter  card holders name \"([^\"]*)\"$")
    public void iEnterCardHoldersName(String name)  {
    new BillingPage().enterCardHolderName("Prime Testing");
    }

    @And("^I enter  card number \"([^\"]*)\"$")
    public void iEnterCardNumber(String cardNumber)  {
    new BillingPage().enterCardNumber("5105105105105100");
    }

    @And("^I select Expiry month$")
    public void iSelectExpiryMonth() {
        new BillingPage().selectExpiryMonth(1);
    }

    @And("^I select Expiry year$")
    public void iSelectExpiryYear() {
        new BillingPage().selectExpiryYear(2);
    }

    @And("^I enter Cvv \"([^\"]*)\"$")
    public void iEnterCvv(String cvv)  {
        new BillingPage().enterCVV("769");
    }

    @And("^I click on Payment Continue on that page$")
    public void iClickOnPaymentContinueOnThatPage() {
        new BillingPage().clickPaymentContinue();
    }

    @And("^I verify Payment Text$")
    public void iVerifyPaymentText() {
    Assert.assertEquals("Payment Method: Credit Card",new BillingPage().getPaymentText());
    }

    @And("^I verify Shipping Text$")
    public void iVerifyShippingText() {
     Assert.assertEquals("Shipping Method: Next Day Air",new BillingPage().getShippingText());
    }

    @And("^I verify Price$")
    public void iVerifyPrice() {
        Assert.assertEquals("$2,950.00",new BillingPage().getPriceText());
    }

    @And("^I click on confirm button$")
    public void iClickOnConfirmButton() {
        new BillingPage().clickConfirm();
    }

    @And("^I verify Thank you text$")
    public void iVerifyThankYouText() {
        Assert.assertEquals("Thank you",new BillingPage().getHeadText());
    }

    @And("^I verify Success Text$")
    public void iVerifySuccessText() {
        Assert.assertEquals("Your order has been successfully processed!",new BillingPage().getSuccessText());
    }

    @And("^I click on continue after verifying$")
    public void iClickOnContinueAfterVerifying() {
        new BillingPage().clickOnContinueButton();
    }

    @Then("^I verify Welcome Text$")
    public void iVerifyWelcomeText() {
        Assert.assertEquals("Welcome to our store",new TopMenu().getWelcomeText());
    }
}