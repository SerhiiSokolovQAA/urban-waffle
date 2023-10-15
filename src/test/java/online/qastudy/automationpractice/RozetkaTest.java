package online.qastudy.automationpractice;

import org.testng.annotations.Test;
import ua.kyiv.prog.*;

public class RozetkaTest extends RozetkaSetUp {
    private RozetkaProductSearchTestData rozetkaProductSearchTestData;

    @Test
    public void testProductsSearch() throws InterruptedException {
        rozetkaProductSearchTestData = new RozetkaProductSearchTestData(driver);
        rozetkaProductSearchTestData.clickProductSearchField();
        rozetkaProductSearchTestData.enterProductSearchText(testData.getProductSearchText());
        rozetkaProductSearchTestData.clickSearchButton();
        rozetkaProductSearchTestData.moveFirstPartOfSlider();
        rozetkaProductSearchTestData.moveSecondPartOfSlider();
        rozetkaProductSearchTestData.clickOKButton();
        rozetkaProductSearchTestData.clickLargeIconsButton();
        rozetkaProductSearchTestData.clickSortDropDown();
        rozetkaProductSearchTestData.addFirstProdToTheCart();
        rozetkaProductSearchTestData.addSecondProdToTheCart();
        rozetkaProductSearchTestData.clickTheCart();
        rozetkaProductSearchTestData.removeProductWithHighestPriceFromCart();

    }
}
