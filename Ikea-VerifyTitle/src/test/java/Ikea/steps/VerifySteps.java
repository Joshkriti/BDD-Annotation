package Ikea.steps;

import Ikea.pages.VerifyPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class VerifySteps {

    VerifyPage verifyPage = new VerifyPage();
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @Then("^I should verify page title successfully$")
    public void iShouldVerifyPageTitle() {
        String expectedText = "Fresh home furnishing ideas and affordable furniture - IKEA";
        String actualText = verifyPage.verifyPageTitle();
        Assert.assertEquals(actualText,expectedText);

    }
}
