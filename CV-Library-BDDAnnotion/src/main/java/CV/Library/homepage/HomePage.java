package CV.Library.homepage;

import CV.Library.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
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

    public void findAJob(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType) throws InterruptedException{
        Thread.sleep(2000);
        sendTextToElement(jobTitleArea,jobTitle);
        sendTextToElement(locationArea,location);
        Thread.sleep(2000);
        sendTextToElement(distanceArea,distance);
        sendTextToElement(salaryMinField,salaryMin);
        Thread.sleep(2000);
        sendTextToElement(salaryMaxField,salaryMax);
        sendTextToElement(salaryTypeSelect,salaryType);
        sendTextToElement(jobTypeSelect,jobType);
    }


    public void clickOnCookies(){
        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//*[text()='Accept All']")).click();
        driver.switchTo().defaultContent();

    }
    public String getVerifyText() {
        String message = getTextFromElement(verifyText);
        log.info("Getting text from : " + verifyText.toString());
        return message;
    }

    public void enterJobTitle(String jobTitle) {
        log.info("enter job tile");
        sendTextToElement(jobTitleArea, jobTitle);

    }







}
