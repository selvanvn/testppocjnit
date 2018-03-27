package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by e052988 on 3/22/18.
 */
public class CerseiRegisterPage{

    public CerseiRegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".toolbar__title")
    private WebElement secureCheckoutHeader;

    @FindBy(name = "card")
    private WebElement cardNumber;

    @FindBy(name = "month")
    private WebElement cardExpiryMonth;

    @FindBy(name = "year")
    private WebElement cardExpiryYear;

    @FindBy(xpath = "//button[@type='submit']")
    private static WebElement continueButton;

    public boolean validateHeader(){
        return secureCheckoutHeader.isDisplayed();
    }

    public void enterCardDetails(String cardNum, String cardMonth, String cardYear){
        cardNumber.sendKeys(cardNum);
        cardExpiryMonth.sendKeys(cardMonth);
        cardExpiryYear.sendKeys(cardYear);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

}
