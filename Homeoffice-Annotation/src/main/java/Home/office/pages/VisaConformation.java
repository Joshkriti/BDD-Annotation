package Home.office.pages;

import Home.office.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    @FindBy(xpath = "//select[@id='response']")
    WebElement selectNationality;

    @CacheLookup
    @FindBy (xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//*[@class='govuk-radios']/div/input[1]")
    WebElement reasonForVisit;
    @CacheLookup
    @FindBy (xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement secondContinueButton;

    @CacheLookup
    @FindBy (xpath = "//*[@class='govuk-!-margin-bottom-6']/h2")
    WebElement verifyMessage;

    @CacheLookup
    @FindBy (xpath = "//*[@class='govuk-radios']/div[2]/input[1]")
    WebElement jobType;

    @CacheLookup
    @FindBy (xpath = "//*[@class='govuk-radios']/div[2]/input")
    WebElement lengthOfStay;

    @CacheLookup
    @FindBy(xpath = "//*[@id='current-question']/button")
    WebElement thirdContinueButton;

    @CacheLookup
    @FindBy (xpath = "//label[text()='Health and care professional']")
    WebElement jobTypeAgain;

    @CacheLookup
    @FindBy (xpath = "//*[text()='Continue']")
    WebElement forthContinueButton;

    @CacheLookup
    @FindBy(xpath = "//*[@class='govuk-radios']/div[5]/input")
    WebElement reasonToVisitUK;
    @CacheLookup
    @FindBy (xpath = "//*[@class='govuk-!-margin-bottom-6']/h2")
    WebElement verifyReasonToVisitUK;

    @CacheLookup
    @FindBy (xpath = "//*[@id=\"result-info\"]/div[2]/div/div/p[1]")
    WebElement verifyReasonToVisit;

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

    public void selectNationality(String nationality){
        log.info("Select nationality");
        selectByVisibleTextFromDropDown(selectNationality,nationality);
    }

    public void clickOnContinueButton(){
        log.info("Click on continue button");
        clickOnElement(continueButton);
    }

    public void clickOnReasonForVisit(){
        log.info("Click on reason for visiting");
        clickOnElement(reasonForVisit);
    }

    public void clickOnSecondContinueButton(){
        log.info("It should click on now");
        clickOnElement(secondContinueButton);
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

    public void selectLengthOfStay(){
        log.info("Length of stay");
        clickOnElement(lengthOfStay);
    }

    public void clickOnThirdContinueButton(){
        log.info("click on third button");
        clickOnElement(thirdContinueButton);
    }

    public void SelectJobTypeAgain(){
        log.info("job type again");
        clickOnElement(jobTypeAgain);
    }

    public  void clickOnForthButton(){
        log.info("click on forth button");
        clickOnElement(forthContinueButton);
    }

    public void selectReasonToVisitUK(){
        log.info("Visit UK");
        clickOnElement(reasonToVisitUK);
    }
    public String getVerifyReasonToVisitUK(){
        String message = getTextFromElement(verifyReasonToVisitUK);
        log.info("Getting text from: " + verifyReasonToVisitUK.toString());
        return message;
    }
    public String getVerifyReasonToVisit(){
        String message = getTextFromElement(verifyReasonToVisit);
        log.info("Getting text from: " + verifyReasonToVisit.toString());
        return message;
    }






}
