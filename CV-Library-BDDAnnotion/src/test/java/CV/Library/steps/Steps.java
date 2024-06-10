package CV.Library.steps;

import CV.Library.homepage.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

    HomePage homePage = new HomePage();

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @Then("^I should navigate to homepage successfully$")
    public void iShouldNavigateToHomepageSuccessfully() {

    }

    @When("^I click on cookies$")
    public void iClickOnCookies() {
        homePage.clickOnCookies();
    }
}
