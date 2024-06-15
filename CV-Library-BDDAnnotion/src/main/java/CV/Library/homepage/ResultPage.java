package CV.Library.homepage;

import CV.Library.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//*[@id='site-main']/div/div[1]/div[2]/div[1]/div[1]/h1")
    WebElement resultMessage;

    public void verifyText(String expectedMsg){
        String actualMessage = String.valueOf(resultMessage);
        String expectedMessage = String.valueOf(resultMessage);
        Assert.assertEquals(actualMessage,expectedMessage);
    }

}
