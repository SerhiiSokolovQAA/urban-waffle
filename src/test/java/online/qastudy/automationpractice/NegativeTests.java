package online.qastudy.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.kyiv.prog.HomePage;
import ua.kyiv.prog.SignInPage;
import ua.kyiv.prog.TestData;

public class NegativeTests {
    private WebDriver driver;
    private SignInPage signInPage;
    private TestData testData;
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\TOOLS\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        signInPage = new SignInPage(driver);
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

    @Test(dataProvider = "negativeUserData")
    public void testNegativeRegistration(String username, String password) throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = homePage.clickSignIn();
        signInPage.enterEmail(username);
        signInPage.enterAlias(password);
        SignInPage.CreateAccountPage createAccountPage = signInPage.clicksignup();
        String validationMessage = createAccountPage.getValidationMessage();
        Assert.assertTrue(validationMessage.contains(validationMessage), "Please fill out this field.");
    }
}
