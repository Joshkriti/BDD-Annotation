package CV.Library.steps;

import CV.Library.homepage.HomePage;
import CV.Library.homepage.ResultPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class Steps {

    //HomePage homePage = new HomePage();
    HomePage homePage;

    ResultPage resultPage;

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @Then("^I should navigate to homepage successfully$")
    public void iShouldNavigateToHomepageSuccessfully() {
        String expectedText = "Find a job";
        String actualText= homePage.getVerifyText();
        Assert.assertEquals(actualText, expectedText);
    }

    @And("^I enter job title$")
    public void iEnterJobTitle() {

    }
    /*@When("^I click on cookies$")
    public void iClickOnCookies() {
        homePage.handleCookiesInIframe();
    }
*/
    @And("^I enter following details$")
    public void iEnterFollowingDetails(DataTable dataTable) throws InterruptedException {

        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String,String> columns : rows){
            new HomePage().findAJob(columns.get("jobTitle"), columns.get("location"), columns.get("distance"), columns.get("salaryMin"),
                    columns.get("salaryMax"),columns.get("salaryType"), columns.get("jobType"), columns.get("result"));
        }


    }

    @Then("^I should see the result \"([^\"]*)\"$")
    public void iShouldSeeTheResult(String textMessage) {
        resultPage.verifyText(textMessage);
    }
}
