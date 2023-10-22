package ua.kyiv.prog.currency;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import ua.kyiv.prog.automationexperience.SignInPage;
import ua.kyiv.prog.automationexperience.TestData;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CurrencyConversionTestSetup {

        protected WebDriver driver;
        protected SignInPage signInPage;
        protected TestData testData;
        protected CurrencyConverterPage сurrencyConverterPage;

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
            CurrencyConverterPage currencyConverterPage = new CurrencyConverterPage(driver);
            signInPage = new SignInPage(this.driver);
            testData = new TestData();
            driver.get("https://finance.i.ua/converter/");
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
