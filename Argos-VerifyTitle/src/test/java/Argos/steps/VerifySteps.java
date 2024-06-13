package Argos.steps;

import Argos.pages.VerifyPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class VerifySteps {

    VerifyPage verifyPage = new VerifyPage();

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @Then("^I should verify page title successfully$")
    public void iShouldVerifyPageTitleSuccessfully() {
        String actualText = "Argos | Order online today for fast home delivery";
        String expectedText = verifyPage.verifyPageTitle();
        Assert.assertEquals(actualText,expectedText);
    }
}
