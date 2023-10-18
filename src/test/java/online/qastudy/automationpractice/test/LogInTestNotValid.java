package online.qastudy.automationpractice.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import ua.kyiv.prog.automationexperience.AutomationSetUp;
import ua.kyiv.prog.automationexperience.SignInPage;

public class LogInTestNotValid extends AutomationSetUp {

@Test
public void testRegistration() throws InterruptedException {
        SignInPage signInPage = new SignInPage(this.driver);
        signInPage.clickSignIn();
        signInPage.enterEmail(testData.getEmail());
        signInPage.enterAlias(testData.getAlias());
        SignInPage.CreateAccountPage createAccountPage = signInPage.clicksignup();
        signInPage.enterPassword(testData.getPassword());
        signInPage.clickSelectMaleGender();
        signInPage.clickSignUpForNewsLetters();
        signInPage.clickReceiveOffers();
        signInPage.enterFirstName(testData.getFirstName());
        signInPage.enterLastName(testData.getLastName());
        signInPage.enterAddress(testData.getAddress());
        signInPage.enterState(testData.getState());
        signInPage.enterCity(testData.getCity());
        signInPage.enterZipcode(testData.getZipcode());

        signInPage.clickCreateAccount();

        String validationMessage = createAccountPage.getValidationMessage();
        Assert.assertTrue(validationMessage.contains(validationMessage), "Please fill out this field.");
        }
}