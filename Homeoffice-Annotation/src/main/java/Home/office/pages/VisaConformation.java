package Home.office.pages;

import Home.office.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VisaConformation extends Utility {
    private static final Logger log = LogManager.getLogger(VisaConformation.class.getName());

    public VisaConformation(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//*[text()='Accept additional cookies']")
    WebElement cookiesAccept;

    @CacheLookup
    @FindBy(xpath = "//h1[@class='gem-c-title__text govuk-heading-xl']")
    WebElement verifyText;

    @CacheLookup
    @FindBy(xpath = "//*[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startButton;

    @CacheLookup
    @FindBy(className = "govuk-select")
    WebElement nationality;

    @CacheLookup
    @FindBy (xpath = "//*[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//*[@class='govuk-radios']/div/input[1]")
    WebElement reasonForVisit;

    @CacheLookup
    @FindBy (xpath = "//*[@class='govuk-!-margin-bottom-6']/h2")
    WebElement verifyMessage;

    @CacheLookup
    @FindBy (xpath = "//*[@class='govuk-radios']/div[2]/input[1]")
    WebElement jobType;

    public void clickOnCookies(){
        log.info("Click on cookies: ");
        clickOnElement(cookiesAccept);

    }

    public String getVerifyText(){
        String message = getTextFromElement(verifyText);
        log.info("Getting text from: " + verifyText.toString());
        return message;
    }

    public void clickOnStartButton(){
        log.info("Click on start button: ");
        clickOnElement(startButton);
    }

    public void selectNationality(WebElement element, String text){
        new Select(element).selectByVisibleText(text);
    }

    public void clickOnContinueButton(){
        log.info("Click on continue button");
        clickOnElement(continueButton);
    }

    public void clickOnReasonForVisit(){
        log.info("Click on reason for visiting");
        clickOnElement(reasonForVisit);
    }

    public String getVerifyMessage(){
        String message = getTextFromElement(verifyMessage);
        log.info("Getting text from: " + verifyMessage.toString());
        return message;
    }

    public void getJobType(){
        log.info("Job type: ");
        clickOnElement(jobType);
    }






}
