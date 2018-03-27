package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by e052988 on 3/22/18.
 */
public class ThreeDSVerificationPage {

   public ThreeDSVerificationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "text-xs-center primary--text")
    private WebElement threeDSText;

    @FindBy(css = "button[type='submit']")
    private WebElement verifyButton;

    public boolean verifyThreeDSPage() {
        return threeDSText.isDisplayed();
    }

    public boolean verifyButtonIsPresent() {
        return verifyButton.isDisplayed();
    }

    public void clickVerifyButton() {
        verifyButton.click();
    }
}
