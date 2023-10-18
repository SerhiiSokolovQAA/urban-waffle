package ua.kyiv.prog.currency;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;


public class CurrencyConverterPage {

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    private static WebDriver driver;

    public CurrencyConverterPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void enterAmount(String amount) {
        WebElement amountInput = driver.findElement(By.xpath("//*[@id=\"currency_amount\"]"));
        amountInput.sendKeys(amount);
    }
    public static void clickPLNCurrency() {
        WebElement PLNCurrency = driver.findElement(By.xpath("//*[@id=\"converter_currency\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PLNCurrency);
        Select dropdown = new Select(PLNCurrency);
        dropdown.selectByValue("PLN");
    }
    public static void clickUAHCurrency() {
        WebElement UAHCurrency = driver.findElement(By.xpath("//*[@id=\"converter_currency\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", UAHCurrency);
        Select dropdown = new Select(UAHCurrency);
        dropdown.selectByValue("UAH");
    }
    public static void clickUSDCurrency() {
        WebElement USDCurrency = driver.findElement(By.xpath("//*[@id=\"converter_currency\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", USDCurrency);
        Select dropdown = new Select(USDCurrency);
        dropdown.selectByValue("USD");
    }
    public static void clickEURCurrency() {
        WebElement EURCurrency = driver.findElement(By.xpath("//*[@id=\"converter_currency\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", EURCurrency);
        Select dropdown = new Select(EURCurrency);
        dropdown.selectByValue("EUR");
    }

    public void selectFromCurrency(String currency) {
        WebElement fromCurrencyDropdown = driver.findElement(By.id("fromCurrency"));
        fromCurrencyDropdown.sendKeys(currency);
    }

    public void selectToCurrency(String currency) {
        WebElement toCurrencyDropdown = driver.findElement(By.id("toCurrency"));
        toCurrencyDropdown.sendKeys(currency);
    }

    public void clickConvertButton() {
        WebElement convertButton = driver.findElement(By.id("convertButton"));
        convertButton.click();
    }

    public double getActualResult() {
        WebElement resultElement = driver.findElement(By.id("result"));
        String resultText = resultElement.getText();
        return Double.parseDouble(resultText);
    }

    public double getExpectedConversion() {
        return 85.0;
    }
}

