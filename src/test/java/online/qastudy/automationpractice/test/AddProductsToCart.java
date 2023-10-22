package online.qastudy.automationpractice.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import ua.kyiv.prog.automationexperience.AutomationSetUp;
import ua.kyiv.prog.automationexperience.SignInPage;

public class AddProductsToCart extends AutomationSetUp {

    @Test
    public void testCartTest() throws InterruptedException {
        SignInPage signInPage = new SignInPage(this.driver);
        signInPage.clickWomenButton();
        signInPage.clickWomenButton();
        signInPage.clickDressesButton();
        signInPage.clickViewProduct();
        signInPage.enterQuantity(testData.getQuantity());
        signInPage.clickAddToCart();
        signInPage.clickContinueShopping();
        signInPage.clickmenButton();
        signInPage.clickTshirtsButton();
        signInPage.clickViewProductSecond();
        signInPage.clickAddToCart();
        signInPage.clickContinueShopping();
        signInPage.clickCartButton();
        signInPage.assertItemsArePresentInTheCart();
        signInPage.doLigInWithExistingUser();
        signInPage.clickCheckoutButton();
        signInPage.assertAddressesAreEqual();
        signInPage.assertPricesInTheCart();

    }
}
