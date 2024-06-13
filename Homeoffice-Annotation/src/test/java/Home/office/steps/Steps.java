package Home.office.steps;

import Home.office.pages.VisaConformation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Steps {

    VisaConformation visaConformation = new VisaConformation();
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I click on cookies it should accept my cookies$")
    public void iClickOnCookiesItShouldAcceptMyCookies() {
        visaConformation.clickOnCookies();
    }


    @Then("^I should navigate homepage successfully$")
    public void iShouldNavigateHomepageSuccessfully() {
        String expectedText = "Check if you need a UK visa";
        String actualText = visaConformation.getVerifyText();
        Assert.assertEquals(expectedText,actualText);
    }

    @Then("^I click on start button$")
    public void iClickOnStartButton() {
        visaConformation.clickOnStartButton();
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() throws InterruptedException {
        visaConformation.clickOnContinueButton();
    }

    @And("^I click on reason to visit$")
    public void iClickOnReasonToVisit() throws InterruptedException {
        Thread.sleep(2000);
        visaConformation.clickOnReasonForVisit();
    }

    @Then("^I should verify text message successfully$")
    public void iShouldVerifyTextMessageSuccessfully() {
        String expectedMessage = "You will not need a visa to come to the UK";
        String actualMessage = visaConformation.getVerifyMessage();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @And("^I select nationality \"([^\"]*)\"$")
    public void iSelectNationality(String nationality)  {
        visaConformation.selectNationality(nationality);
    }

    @And("^I click on second continue button$")
    public void iClickOnSecondContinueButton() {
        visaConformation.clickOnSecondContinueButton();
    }

    @And("^I select job type$")
    public void iSelectJobType() {
        visaConformation.getJobType();
    }

    @And("^I select length of stay$")
    public void iSelectLengthOfStay() throws InterruptedException {
        Thread.sleep(2000);
        visaConformation.selectLengthOfStay();
    }

    @And("^I click on third continue button$")
    public void iClickOnThirdContinueButton() {
        visaConformation.clickOnThirdContinueButton();
    }
    

    @And("^I click on forth button$")
    public void iClickOnForthButton() {
        visaConformation.clickOnForthButton();
    }

    @And("^I select job type again$")
    public void iSelectJobTypeAgain() {
        visaConformation.SelectJobTypeAgain();
    }

    @And("^I click on reason to visit UK$")
    public void iClickOnReasonToVisitUK() throws InterruptedException {
        Thread.sleep(2000);
        visaConformation.selectReasonToVisitUK();
    }

    @Then("^I should verify text message successfully to visit UK$")
    public void iShouldVerifyTextMessageSuccessfullyToVisitUK() {
        String expectedMessage = "You need a visa to work in health and care";
        String actualMessage = visaConformation.getVerifyReasonToVisitUK();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @Then("^I should verify text message successfully not visit UK$")
    public void iShouldVerifyTextMessageSuccessfullyNotVisitUK() {
        String expectedMessage = "Whether you need a visa depends on how long you’re staying in the UK.";
        String actualMessage = visaConformation.getVerifyReasonToVisit();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
