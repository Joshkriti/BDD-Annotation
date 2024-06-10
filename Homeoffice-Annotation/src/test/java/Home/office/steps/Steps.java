package Home.office.steps;

import Home.office.pages.VisaConformation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Steps {

    VisaConformation visaConformation = new VisaConformation();
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on cookies it should accept my cookies$")
    public void iClickOnCookiesItShouldAcceptMyCookies() {
        visaConformation.clickOnCookies();
    }


    @Then("^I should navigate homepage successfully$")
    public void iShouldNavigateHomepageSuccessfully() {
        String expectedText = "Check if you need a UK visa";
        String actualText = visaConformation.getVerifyText();
        Assert.assertEquals(expectedText,actualText);
    }

    @And("^I click on start button$")
    public void iClickOnStartButton() {
        visaConformation.clickOnStartButton();
    }

    @And("^I choose nationality$")
    public void chooseNationality() {

    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        visaConformation.clickOnContinueButton();
    }

    @And("^I click on reason to visit$")
    public void iClickOnReasonToVisit() {
        visaConformation.clickOnReasonForVisit();

    }

    @Then("^I should verify text message successfully$")
    public void iShouldVerifyTextMessageSuccessfully() {
        String expectedMessage = "You will not need a visa to come to the UK";
        String actualMessage = visaConformation.getVerifyMessage();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @And("^I click on job type$")
    public void iClickOnJobType() {
        visaConformation.getJobType();

    }
}
