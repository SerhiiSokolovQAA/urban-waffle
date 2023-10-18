package ua.kyiv.prog.expectedcondition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import ua.kyiv.prog.automationexperience.TestData;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CustomExpectedConditionsSetUp {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected TestData testData;
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
            driver.get("");
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
