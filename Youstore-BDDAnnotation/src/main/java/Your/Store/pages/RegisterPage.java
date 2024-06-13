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

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy (name = "firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy (name = "lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy (name = "email")
    WebElement emailAddress;

    @CacheLookup
    @FindBy (name = "telephone")
    WebElement telephoneNumber;

    @CacheLookup
    @FindBy (name = "password")
    WebElement password1;

    @CacheLookup
    @FindBy (name = "confirm")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy (xpath = "//*[@class='form-group']/div[1]/label[1]/input")
    WebElement selectRadioButton;

    @CacheLookup
    @FindBy (xpath = "//*[@name='agree']")
    WebElement termAndCondition;

    @CacheLookup
    @FindBy (xpath = "//*[@class='btn btn-primary']")
    WebElement continueButton;

    @CacheLookup
    @FindBy (xpath = "//*[@id='content']/h1")
    WebElement verifyMessage;

    public void register(String fName, String lName, String email,String telephone, String password, String cPassword) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(firstName,fName);
        sendTextToElement(lastName,lName);
        Thread.sleep(2000);
        sendTextToElement(emailAddress,email);
        Thread.sleep(2000);
        sendTextToElement(telephoneNumber,telephone);
        sendTextToElement(password1,password);
        sendTextToElement(confirmPassword,cPassword);
    }

    public void clickOnRadioButton(){
        clickOnElement(selectRadioButton);
    }

    public void clickOnTeamAndCondition(){
        clickOnElement(termAndCondition);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public String setVerifyMessage(){
        String message = getTextFromElement(verifyMessage);
        log.info("Getting message from: " + verifyMessage.toString());
        return message;
    }

        public void selectMyAccountRegister(String option) {
        WebElement dropDown = driver.findElement(By.xpath("//a[@title='My Account']/span[1]"));
        dropDown.click();
        List<WebElement> optionsAccount = driver.findElements(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a"));
        for (WebElement options : optionsAccount) {
            if (options.getText().equalsIgnoreCase("Register")) {
                System.out.println(options.getText());
                options.click();
            }
        }
    }

}
