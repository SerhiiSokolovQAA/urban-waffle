package ua.kyiv.prog.apitestsetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import ua.kyiv.prog.automationexperience.TestData;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApiTestSetUp {

    public WebDriver driver;
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
            driver.get("https://openweathermap.org/");
            driver.manage().window().maximize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
