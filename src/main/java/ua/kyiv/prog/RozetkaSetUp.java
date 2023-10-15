package ua.kyiv.prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class RozetkaSetUp {

    protected WebDriver driver;
    protected SignInPage signInPage;
    protected TestData testData;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\TOOLS\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();
        CurrencyConverterPage currencyConverterPage = new CurrencyConverterPage(driver);
        signInPage = new SignInPage(driver);
        testData = new TestData();
        driver.get("https://rozetka.com.ua/ua/");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
