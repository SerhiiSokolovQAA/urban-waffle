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

public class RegistrationHappyFlow {
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
    public void testRegistration() throws InterruptedException {
        driver.get("http://automationexercise.com/");
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = homePage.clickSignIn();

        signInPage.enterEmail(testData.getEmail());
        signInPage.enterAlias(testData.getAlias());
        SignInPage.CreateAccountPage createAccountPage = signInPage.clicksignup();
        signInPage.enterPassword(testData.getPassword());
        signInPage.clickSelectMaleGender();
        signInPage.clickSignUpForNewsLetters();
        signInPage.clickReceiveOffers();
        signInPage.clickDay();
        signInPage.clickMonth();
        signInPage.clickYear();
        signInPage.enterFirstName(testData.getFirstName());
        signInPage.enterLastName(testData.getLastName());
        signInPage.enterAddress(testData.getAddress());
        signInPage.enterState(testData.getState());
        signInPage.enterCity(testData.getCity());
        signInPage.enterZipcode(testData.getZipcode());
        signInPage.enterMobilePhone(testData.getPhone());

        signInPage.clickCreateAccount();

        String validationMessage = createAccountPage.getValidationMessage();
        Assert.assertTrue(validationMessage.contains(validationMessage), "Your new account has been successfully created!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}