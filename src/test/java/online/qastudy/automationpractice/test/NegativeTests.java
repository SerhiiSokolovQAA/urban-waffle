package online.qastudy.automationpractice.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import ua.kyiv.prog.automationexperience.AutomationSetUp;
import ua.kyiv.prog.automationexperience.SignInPage;

public class NegativeTests extends AutomationSetUp {

    @Test(dataProvider = "negativeUserData")
    public void testNegativeRegistration(String username, String password) throws InterruptedException {
        SignInPage signInPage = new SignInPage(this.driver);
        signInPage.clickSignIn();
        signInPage.enterEmail(username);
        signInPage.enterAlias(password);
        SignInPage.CreateAccountPage createAccountPage = signInPage.clicksignup();
        String validationMessage = createAccountPage.getValidationMessage();
        Assert.assertTrue(validationMessage.contains(validationMessage), "Please fill out this field.");
    }
}
