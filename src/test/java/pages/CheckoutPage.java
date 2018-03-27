package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by e052988 on 3/22/18.
 */
public class CheckoutPage {

    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h3:contains('Secure Checkout')")
    private WebElement checkoutHeader;

    @FindBy(className = "card__text pt-3")
    private WebElement cardLastFour;

    @FindBy(xpath = "//img[@class='ma-3']")
    private WebElement cardArt1;

    @FindBy(xpath = "//button[@data-test='btn-continue']")
    private WebElement checkoutButton;

    @FindBy(className = "input-group--selection-controls__ripple--active")
    private WebElement savePaymentDetails;

    public boolean verifyPresenceOfCheckoutHeader() {
        return checkoutHeader.isDisplayed();
    }

    public boolean verifyCardArtIsPresent() {
        return cardArt1.isDisplayed();
    }

    public void clickCheckout(){
        checkoutButton.click();
    }

    public boolean verifyToggleButtonIsShown() {
       return savePaymentDetails.isDisplayed();
    }

}
