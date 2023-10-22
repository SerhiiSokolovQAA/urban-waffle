package ua.kyiv.prog.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import ua.kyiv.prog.currency.CurrencyConverterPage;
import ua.kyiv.prog.automationexperience.SignInPage;
import ua.kyiv.prog.automationexperience.TestData;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RozetkaSetUp {

    protected WebDriver driver;
    protected TestData testData;
    protected WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        Properties prop = new Properties();
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            InputStream input = classLoader.getResourceAsStream("autotestspractice.properties");
            prop.load(input);

            String chromedriverPath = prop.getProperty("chromedriver.path");
            System.setProperty("webdriver.chrome.driver", chromedriverPath);
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 10);
            testData = new TestData();
            driver.get("https://rozetka.com.ua/ua/");
            driver.manage().window().maximize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
