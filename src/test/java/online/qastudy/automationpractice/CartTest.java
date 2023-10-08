package online.qastudy.automationpractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ua.kyiv.prog.HomePage;
import ua.kyiv.prog.SignInPage;
import ua.kyiv.prog.TestData;

public class CartTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private TestData testData;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\TOOLS\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        testData = new TestData();

    }

    @Test
    public void testCartTest() throws InterruptedException {
        driver.get("http://automationexercise.com/");
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = homePage.clickWomenButton();

        signInPage.clickDressesButton();
        signInPage.clickViewProduct();
        signInPage.enterQuantity(testData.getQuantity());
        signInPage.clickAddToCart();
        signInPage.clickContinueShopping();
        homePage.clickWomenButton();
        signInPage.clickDressesButton();
        signInPage.clickViewProductNew();
        signInPage.enterQuantity("2");
        signInPage.clickAddToCart();
        signInPage.clickViewCart();
        String actualResultForFirstItemInTheCart = signInPage.getTotalPriceForFirstItemInCart();
        String expectedResultForFirstItemInTheCart = "Rs. 3000";
        Assert.assertEquals(expectedResultForFirstItemInTheCart, actualResultForFirstItemInTheCart);
        String actualResultForSecondItemInTheCart = signInPage.getTotalPriceForFirstItemInCart();
        String expectedResultForSecondItemInTheCart = "Rs. 3000";
        Assert.assertEquals(expectedResultForSecondItemInTheCart, actualResultForSecondItemInTheCart);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}