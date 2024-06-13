package Amazon.pages;

import Amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class VerifyPage extends Utility {
    private static final Logger log = LogManager.getLogger(VerifyPage.class.getName());

    public VerifyPage() {
        PageFactory.initElements(driver, this);
        driver.getTitle();
    }

        public String verifyPageTitle () {
            String message = driver.getTitle();
            log.info("Getting text from: ");
            return message;

        }




}
