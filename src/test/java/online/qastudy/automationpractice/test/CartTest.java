package online.qastudy.automationpractice.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import ua.kyiv.prog.automationexperience.AutomationSetUp;
import ua.kyiv.prog.automationexperience.SignInPage;

public class CartTest extends AutomationSetUp {

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
        signInPage.clickWomenButton();
        signInPage.clickDressesButton();
        signInPage.clickViewProductNew();
        signInPage.enterQuantity("2");
        signInPage.clickAddToCart();
        signInPage.clickViewCart();
        String actualResultForFirstItemInTheCart = signInPage.getTotalPriceForFirstItemInCart();
        String expectedResultForFirstItemInTheCart = "Rs. 3000";
        Assert.assertEquals(expectedResultForFirstItemInTheCart, actualResultForFirstItemInTheCart);
        String actualResultForSecondItemInTheCart = signInPage.getTotalPriceForFirstItemInCart();
        String expectedResultForSecondItemInTheCart = "Rs. 3000";
        Assert.assertEquals(expectedResultForSecondItemInTheCart, actualResultForSecondItemInTheCart);
    }
}