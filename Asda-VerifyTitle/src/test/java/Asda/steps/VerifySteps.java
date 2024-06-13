package Asda.steps;

import Asda.pages.VerifyPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class VerifySteps {

    VerifyPage verifyPage = new VerifyPage();
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @Then("^I should verify page title successfully$")
    public void iShouldVerifyPageTitle() throws InterruptedException {
        String expectedText = "Asda.com - Online Food Shopping, George, & more";
        String actualText = verifyPage.verifyPageTitle();
        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(5000);

    }
}
