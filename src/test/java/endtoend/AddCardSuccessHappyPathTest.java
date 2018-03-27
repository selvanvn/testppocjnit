package endtoend;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import pages.CerseiRegisterPage;
import pages.CheckoutPage;
import pages.ThreeDSVerificationPage;
import utilities.Retry;

/**
 * Created by e052988 on 3/22/18.
 */

public class AddCardSuccessHappyPathTest {

    WebDriver driver;
    CerseiRegisterPage cp,cp2,cp3;//= PageFactory.initElements(driver,CerseiRegisterPage.class);
    CheckoutPage c;//=PageFactory.initElements(driver,CheckoutPage.class);
    ThreeDSVerificationPage tp;//=PageFactory.initElements(driver,ThreeDSVerificationPage.class);
    String browser = "chrome";


    @Rule
    public Retry retryRule = new Retry(3);


    @Before
    public void setup(){
        System.out.println("SETUP PHASE");
        driver= utilities.DriverProvider.initialize(browser);
        driver.get("https://cersei.apps.stl.pcfstage00.mastercard.int/register");
        cp = new CerseiRegisterPage(driver);
        c =  new CheckoutPage(driver);
        tp = new ThreeDSVerificationPage(driver);
    }


    @Test
    public void addCardEndToEndFlow4()
    {
        cp.enterCardDetails("5413850000000123","11","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
        Assert.fail();
    }

    @Test
    public void addCardEndToEndFlow5()
    {
        cp.enterCardDetails("5413850000000123","11","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
        //Assert.assertEquals(1,2);

    }


    @Test
    public void addCardEndToEndFlow6()
    {
        cp.enterCardDetails("5413850000000123","11","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
        //Assert.assertEquals(1,2);

    }

    @Test
    public void addCardEndToEndFlow7()
    {
        cp.enterCardDetails("5413850000000123","11","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
        //Assert.assertEquals(1,2);

    }

    @Test
    public void addCardEndToEndFlow8()
    {
        cp.enterCardDetails("5413850000000123","11","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
        //Assert.assertEquals(1,2);

    }

    @Test
    public void addCardEndToEndFlow9()
    {
        cp.enterCardDetails("5413850000000123","11","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
        //Assert.assertEquals(1,2);

    }

    @Test
    public void addCardEndToEndFlow10()
    {
        cp.enterCardDetails("5413850000000123","11","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
        //Assert.assertEquals(1,2);

    }

//    @Test
//    public void addCardEndToEndFlow5()
//    {
//        cp.enterCardDetails("5413850000000123","11","20");
//        cp.clickContinueButton();
//        c.clickCheckout();
//        tp.clickVerifyButton();
//        //Assert.assertEquals(1,2);
//
//    }
//
//    @Test
//    public void addCardEndToEndFlow5()
//    {
//        cp.enterCardDetails("5413850000000123","11","20");
//        cp.clickContinueButton();
//        c.clickCheckout();
//        tp.clickVerifyButton();
//        //Assert.assertEquals(1,2);
//
//    }
//


    @After
    public void tearDown()
    {
        System.out.println("TEARDOWN");
      driver.quit();

    }

    public static class JunitParallel {

    }
}
