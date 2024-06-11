package CV.Library.steps;

import CV.Library.homepage.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Steps {

    HomePage homePage = new HomePage();

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @Then("^I should navigate to homepage successfully$")
    public void iShouldNavigateToHomepageSuccessfully() {
        String expectedText = "Find a job";
        String actualText= homePage.getVerifyText();
        Assert.assertEquals(actualText, expectedText);
    }

    @When("^I click on cookies$")
    public void iClickOnCookies() {
        homePage.clickOnCookies();
    }

    @And("^I enter job title$")
    public void iEnterJobTitle() {

    }

    @And("^I enter following details$")
    public void iEnterFollowingDetails(DataTable dataTable) {

        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);


    }
}
