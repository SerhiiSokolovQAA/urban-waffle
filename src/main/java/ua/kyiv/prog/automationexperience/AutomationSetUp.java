package ua.kyiv.prog.automationexperience;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AutomationSetUp {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected TestData testData;

    @BeforeClass
    public void setUp() {
        PageFactory.initElements(this.driver, this);
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
            driver.get("http://automationexercise.com/");
            driver.manage().window().maximize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DataProvider(name = "negativeUserData")
    public Object[][] negativeUserData() {
        return new Object[][] {
                {"example+115@example.com", "example+115@example.com"},
                {"registeredUsername", "invalidPassword"},
                {"", "password123"},
                {"usernameWithSpace", "password123"},
                {"registeredUsername", ""}
        };
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
