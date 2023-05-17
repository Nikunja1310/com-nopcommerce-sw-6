package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by Nikunja A Senjalia
 */
public class ElectronicSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }


    @When("^I mouse hover on electronics$")
    public void iMouseHoverOnElectronics() {
        new TopMenu().mouseHoverOnElectronic();
    }

    @And("^I select \"([^\"]*)\"$")
    public void iSelect(String option) {
        new TopMenu().selectMenu(option);
    }

    @Then("^User should navigated to cellphone page using \"([^\"]*)\"$")
    public void userShouldNavigatedToCellphonePageUsing(String expected) {
        Assert.assertEquals(new TopMenu().getHeadingText(),expected,"User is not navigated");
    }

    @When("^I click on List view$")
    public void iClickOnListView() {
        new ElectronicPage().selectListView();
    }

    @And("^I Click on product name “Nokia Lumia”$")
    public void iClickOnProductNameNokiaLumia() throws  InterruptedException{
        Thread.sleep(500);
        new ElectronicPage().selectPhone();
    }

    @Then("^I Verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String expected)  {
        Assert.assertEquals(new ElectronicPage().getHeading(),expected,"Navigation is not successful");
    }

    @And("^I Verify the price using \"([^\"]*)\"$")
    public void iVerifyThePriceUsing(String expected)  {
        Assert.assertEquals(new ElectronicPage().getPrice(),expected,"Price is not correct");
    }

    @And("^I Change quantity to \"([^\"]*)\"$")
    public void iChangeQuantityTo(String qty) {
        new ElectronicPage().changeQuantity(qty);
    }

    @And("^I Click on “ADD TO CART” tab$")
    public void iClickOnADDTOCARTTab() {
        new BuildYourComputerPage().addToCart();
    }

    @Then("^I Verify the success Message \"([^\"]*)\" on Top green Bar$")
    public void iVerifyTheSuccessMessageOnTopGreenBar(String expected)  {
        Assert.assertEquals(new ElectronicPage().getQuantity(),expected,"Quantity is not matching");
    }

    @And("^I close the bar clicking on the cross button\\.$")
    public void iCloseTheBarClickingOnTheCrossButton() {
    new BuildYourComputerPage().closeMessage();
    }

    @And("^I MouseHover on Shopping cart$")
    public void iMouseHoverOnShoppingCart() {
        new  BuildYourComputerPage().mouseHoverOnShoppingCart();
    }

    @And("^I Click on GO TO CART button\\.$")
    public void iClickOnGOTOCARTButton() {
        new BuildYourComputerPage().clickOnGoToCart();
    }

    @Then("^I Verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String expected)  {
        Assert.assertEquals(new TopMenu().getHeadingText(),expected,"Shopping cart is not verified");
    }

    @And("^I Verify the quantity is \"([^\"]*)\"$")
    public void iVerifyTheQuantityIs(String exp )  {
        Assert.assertEquals(new ElectronicPage(),exp,"Quantity not matching");
    }

    @And("^I Verify the Total \"([^\"]*)\"$")
    public void iVerifyTheTotal(String exp)  {
       Assert.assertEquals(new ShoppingCartPage().getPrice(),exp,"Price not updated");
    }

    @When("^I click on checkbox of I agree with the terms of service$")
    public void iClickOnCheckboxOfIAgreeWithTheTermsOfService() {
        new ShoppingCartPage().termsAndCondition();
    }

    @And("^I Click on CHECKOUT$")
    public void iClickOnCHECKOUT() {
       new ShoppingCartPage().goCheckout();
    }

    @Then("^I Verify the Text of  \"([^\"]*)\"$")
    public void iVerifyTheTextOf(String exp) {
        Assert.assertEquals(new TopMenu().getHeadingText(),exp,"Not verified");
    }


    @And("^I Click on “REGISTER” tab$")
    public void iClickOnREGISTERTab() {
        new RegisterPage().clickOnRegister();
    }

    @And("^I Fill the mandatory fields$")
    public void iFillTheMandatoryFields() {
      new RegisterPage().enterFirstname("Nirali");
      new RegisterPage().enterLastname("Senjalia");
      new RegisterPage().enterEmail("nirali@gmail.com");
      new RegisterPage().enterPassword("Nirali123");
      new RegisterPage().enterConfirmPassword("Nirali123");
    }

    @And("^I Click on “REGISTER” Button$")
    public void iClickOnREGISTERButton() {
        new RegisterPage().clickOnRegister();
    }

    @And("^I Verify the message \"([^\"]*)\" on registration page$")
    public void iVerifyTheMessageOnRegistrationPage(String exp)  {
        Assert.assertEquals(new TopMenu().getHeadingText(),exp,"Not Registered ");
    }

    @And("^I Click on “CONTINUE” tab$")
    public void iClickOnCONTINUETab() {
        new RegisterPage().clickOnContinue();
    }

    @And("^I Login to website$")
    public void iLoginToWebsite() {
        new LoginPage().clickOnLoginButton();
    }

    @And("^I Fill the rest mandatory field$")
    public void iFillTheRestMandatoryField() {
        new LoginPage().enterEmailId("nirali@gmail.com");
        new LoginPage().enterPassword("nirali123");
    }

    @And("^I Click CONTINUE$")
    public void iClickCONTINUE() {
        new LoginPage().clickOnLoginButton();
    }

    @And("^I Click on Radio Button “Second Day Air”$")
    public void iClickOnRadioButtonSecondDayAir() {
        new BillingPage().selectShipping2();
    }

    @And("^I Click on CONTINUE$")
    public void iClickOnCONTINUE() {
        new BillingPage().clickOnContinue();
    }

    @And("^I Select Radio Button “Credit Card”$")
    public void iSelectRadioButtonCreditCard() {
        new BillingPage().clickCreditCard();
    }

    @And("^I click on Payment Continue$")
    public void iClickOnPaymentContinue() {
        new BillingPage().clickPaymentContinue();
    }

    @And("^I Select “Visa” From Select credit card dropdown$")
    public void iSelectVisaFromSelectCreditCardDropdown() {
        new BillingPage().selectCard(0);
    }

    @And("^I Fill all the details$")
    public void iFillAllTheDetails() {
    new BillingPage().enterCardHolderName("PrimeTesting");
    new BillingPage().enterCardNumber("5105105105105100");
    new BillingPage().selectExpiryMonth(1);
    new BillingPage().selectExpiryYear(2);
    new BillingPage().enterCVV("769");

    }

    @And("^I click on next Payment Continue$")
    public void iClickOnNextPaymentContinue() {
        new BillingPage().clickOnContinue();
    }

    @Then("^I Verify Payment Method is \"([^\"]*)\"$")
    public void iVerifyPaymentMethodIs(String exp) {
       Assert.assertEquals(new BillingPage().getPaymentText(),exp,"Payment not verified");
    }

    @And("^I Verify Shipping Method is \"([^\"]*)\"$")
    public void iVerifyShippingMethodIs(String exp)  {
        Assert.assertEquals(new BillingPage().getShippingText(),exp,"Shipping method not correct");
    }

    @And("^I Verify Total is \"([^\"]*)\"$")
    public void iVerifyTotalIs(String exp)  {
        Assert.assertEquals(new BillingPage().getPriceText(),exp,"Price not matching");
    }

    @And("^I Click on CONFIRM$")
    public void iClickOnCONFIRM() {
        new BillingPage().clickConfirm();
    }

    @Then("^I Verify the Text head \"([^\"]*)\"$")
    public void iVerifyTheTextHead(String exp) {
        Assert.assertEquals(new BillingPage().getHeadText(),exp,"Not verified");
    }

    @Then("^I Verify the Success message \"([^\"]*)\"$")
    public void iVerifyTheSuccessMessage(String exp)  {
        Assert.assertEquals(new BillingPage().getSuccessText(),exp,"Message not found");
    }

    @And("^I Click on CONTINUE Button$")
    public void iClickOnCONTINUEButton() {
    new BillingPage().clickOnContinueButton();
    }

    @Then("^I Verify the text using \"([^\"]*)\"$")
    public void iVerifyTheTextUsing(String exp) {
        Assert.assertEquals(new TopMenu().getWelcomeText(),exp,"Message not found");
    }

    @When("^I Click on “Logout” link$")
    public void iClickOnLogoutLink() {
        new LoginPage().clickOnLogout();
    }

    @Then("^I Verify the URL is \"([^\"]*)\"$")
    public void iVerifyTheURLIs(String exp)  {
        Assert.assertEquals(new ElectronicPage().getPageURL(),exp,"URL not verified");
    }

}
