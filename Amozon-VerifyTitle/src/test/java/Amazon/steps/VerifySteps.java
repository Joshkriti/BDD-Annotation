package Amazon.steps;

import Amazon.pages.VerifyPage;
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
        String expectedText = "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more";
        String actualText = verifyPage.verifyPageTitle();
        Assert.assertEquals(actualText,expectedText);

    }
}
