package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.TopMenu;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I select \"([^\"]*)\" from top bar$")
    public void iSelectFromTopBar(String menu)  {
      new TopMenu().selectMenu(menu);
    }

    @Then("^I should successfully navigate to the menu page$")
    public void iShouldSuccessfullyNavigateToTheMenuPage() {
    }

    @And("^I should see the \"([^\"]*)\"$")
    public void iShouldSeeThe(String  pageName) {
        Assert.assertEquals(new TopMenu().getHeadingText(),pageName, "User is not navigated successfully");
    }
}
