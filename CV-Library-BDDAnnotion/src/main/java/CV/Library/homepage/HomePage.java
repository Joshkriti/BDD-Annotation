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
