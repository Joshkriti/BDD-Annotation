package CV.Library.homepage;

import CV.Library.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//h1[text()='Find a job']")
    WebElement verifyText;

    @CacheLookup
    @FindBy (id = "keywords")
    WebElement jobTitleArea;

    @CacheLookup
    @FindBy (id = "location")
    WebElement locationArea;

    @CacheLookup
    @FindBy (id = "distance")
    WebElement distanceArea;

    @CacheLookup
    @FindBy (id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy (id = "salarymin")
    WebElement salaryMinField;

    @CacheLookup
    @FindBy (id = "salarymax")
    WebElement salaryMaxField;

    @CacheLookup
    @FindBy (id = "salarytype")
    WebElement salaryTypeSelect;

    @CacheLookup
    @FindBy (id = "tempperm")
    WebElement jobTypeSelect;

    @CacheLookup
    @FindBy (id = "hp-search-btn")
    WebElement findJobsButton;

    @CacheLookup
    @FindBy (xpath = "//*[text()='Accept All']")
    WebElement cookies;

    @CacheLookup
    @FindBy (id = "gdpr-consent-notice" )
    WebElement cookieIframe;

    /*public void handleCookiesInIframe(){
        driver.switchTo().frame(cookieIframe);
        clickOnElement(cookies);
        driver.switchTo().defaultContent();

    }*/

    public void findAJob(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result) throws InterruptedException{
        Thread.sleep(2000);

        driver.switchTo().frame(cookieIframe);
        clickOnElement(cookies);
        driver.switchTo().defaultContent();

        sendTextToElement(jobTitleArea,jobTitle);
        sendTextToElement(locationArea,location);
        Thread.sleep(2000);
        sendTextToElement(distanceArea,distance);
        clickOnElement(moreSearchOptionsLink);
        sendTextToElement(salaryMinField,salaryMin);
        Thread.sleep(2000);
        sendTextToElement(salaryMaxField,salaryMax);
        sendTextToElement(salaryTypeSelect,salaryType);
        Thread.sleep(2000);
        sendTextToElement(jobTypeSelect,jobType);
        clickOnElement(findJobsButton);
    }


    public String getVerifyText() {
        String message = getTextFromElement(verifyText);
        log.info("Getting text from : " + verifyText.toString());
        return message;
    }








}
