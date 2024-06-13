package Your.Store.steps;

import Your.Store.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class RegisterSteps {
    RegisterPage registerPage = new RegisterPage();
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        registerPage.selectMyAccountRegister("Register");
    }
    @And("^I enter following user details$")
    public void iEnterFollowingUserDetails(DataTable datatable) throws InterruptedException {

        List<Map<String,String>> rows = datatable.asMaps(String.class, String.class);

        for (Map<String,String> columns : rows){
            new RegisterPage().register(columns.get("fName"), columns.get("lName"), columns.get("Email"), columns.get("Telephone"), columns.get("Password"),
                    columns.get("cPassword"));
        }
    }

    @And("^I click on radio button$")
    public void iClickOnRadioButton() {
        registerPage.clickOnRadioButton();
    }
    @And("^I click on privacy policy check box$")
    public void iClickOnPrivacyPolicyCheckBox() {
        registerPage.clickOnTeamAndCondition();
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        registerPage.clickOnContinueButton();
    }

    @Then("^I should register to register page successfully$")
    public void iShouldRegisterToRegisterPageSuccessfully() {
        String actualText = registerPage.setVerifyMessage() ;
        String expectedText = "Your Account Has Been Created!";
        Assert.assertEquals(actualText,expectedText);
    }
}
