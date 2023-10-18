package online.qastudy.automationpractice.currencytest;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.kyiv.prog.currency.CurrencyConversionTestSetup;
import ua.kyiv.prog.currency.CurrencyConverterPage;


public class CurrencyConversionTest extends CurrencyConversionTestSetup {


    @Test
    public void testCurrencyConversion() {
        CurrencyConverterPage.enterAmount(testData.getCurrencyAmount());
        CurrencyConverterPage.clickPLNCurrency();
        Assert.assertEquals(signInPage.manipulateAndMultiplyResultForPLN() + ".00", "847.00");
        CurrencyConverterPage.clickUSDCurrency();
        Assert.assertEquals(signInPage.manipulateAndMultiplyResultForUSD() + ".91", "3748.91");
        CurrencyConverterPage.clickEURCurrency();
        Assert.assertEquals(signInPage.manipulateAndMultiplyResultForEUR() + ".67", "3896.67");
    }
}
