package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by e052988 on 3/22/18.
 */
public class DriverProvider {

    public static WebDriver initialize(String browserType) {

        WebDriver driver = null;
        //ChromeDriver chromeDriver = new ChromeDriver();


        if (browserType.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            // Add options to Google Chrome. The window-size is important for responsive sites
            driver = new ChromeDriver();
            System.out.println("Got Chrome Driver");

        } else if(browserType.equals("headlessChrome")) {
            // Add options to Google Chrome. The window-size is important for responsive sites
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            options.addArguments("window-size=1200x600");
            driver = new ChromeDriver(options);

        } else if(browserType.equals("firefox") || browserType.equals("")) {
            // Add options to Google Chrome. The window-size is important for responsive sites
            driver = new FirefoxDriver();
        }
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;

    }
}
