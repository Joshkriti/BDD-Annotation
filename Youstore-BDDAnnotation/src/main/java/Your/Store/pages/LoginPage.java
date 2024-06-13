package Your.Store.pages;

import Your.Store.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (id = "input-email")
    WebElement emailField;

    @CacheLookup
    @FindBy (id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy (css = "input[value='Login']")
    WebElement continueButton;

    @CacheLookup
    @FindBy (xpath = "//*[@id='content']/h2[1]")
    WebElement verifyMyAccount;

    @CacheLookup
    @FindBy (xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement errorMessage1;

    public String getErrorMessage(){
        return getTextFromElement(errorMessage1);
    }

    public void enterEmailId(String email) {
        log.info("enter Email ID");
        sendTextToElement(emailField, email);
    }
    public void enterPassword(String password) {
        log.info("enter Password");
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(continueButton);
    }

    public String getVerifyMessage(){
        String message = getTextFromElement(verifyMyAccount);
        log.info("Getting text from: "+ verifyMyAccount.toString());
        return message;
    }

    public void selectMyAccountLogin (String option) {
        WebElement dropDown1 = driver.findElement(By.xpath("//a[@title='My Account']/span[1]"));
        dropDown1.click();
        List<WebElement> optionsAccount1 = driver.findElements(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a"));
        for (WebElement options1 : optionsAccount1) {
            if (options1.getText().equalsIgnoreCase("Login")) {
                System.out.println(options1.getText());
                options1.click();
            }
        }
    }


}
