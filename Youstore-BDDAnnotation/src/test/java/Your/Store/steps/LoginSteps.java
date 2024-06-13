package Your.Store.steps;

import Your.Store.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        loginPage.selectMyAccountLogin("Login");
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        loginPage.enterEmailId(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        loginPage.clickOnLoginButton();
    }

    @Then("^I should login to login page successfully$")
    public void iShouldLoginToLoginPageSuccessfully() {
        String actualText = loginPage.getVerifyMessage();
        String expectedText = "My Account";
        Assert.assertEquals(actualText,expectedText);
    }

    @And("^I should see error message \"([^\"]*)\"$")
    public void iShouldSeeErrorMessage(String errorMessage) {
        Assert.assertEquals(errorMessage,loginPage.getErrorMessage());
    }
}
