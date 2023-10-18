package ua.kyiv.prog.rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RozetkaProductSearchTestData {
    protected WebDriver driver;

    public RozetkaProductSearchTestData(WebDriver driver) {
        this.driver = driver;
    }

    public void clickProductSearchField() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement productSearchField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"search\"]")));
        productSearchField.click();
    }

    public void enterProductSearchText(String product) {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        WebElement productSearchText = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"search\"]")));
        productSearchText.sendKeys(product);
    }

    public void clickSearchButton() {
        WebElement searchButton = driver.findElement(By.xpath("//*[@class=\"button button_color_green button_size_medium search-form__submit\"]"));
        searchButton.click();
    }

    public void moveFirstPartOfSlider() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement slider = driver.findElement(By.xpath("//*[@class=\"rz-slider__range-button rz-slider__range-button_type_left\"]"));
        int sliderWidth = slider.getSize().getWidth();
        int desiredPercentage = 35;
        int xOffset = (int) (sliderWidth * desiredPercentage / 100);
        Actions builder = new Actions(driver);
        builder.clickAndHold(slider).moveByOffset(xOffset, 0).release().build().perform();
    }

    public void moveSecondPartOfSlider() {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        WebElement slider = driver.findElement(By.xpath("//*[@class=\"rz-slider__range-button rz-slider__range-button_type_right\"]"));
        int sliderWidth = slider.getSize().getWidth();
        int desiredPercentage = 70;
        int xOffset = (int) (sliderWidth * desiredPercentage / 100);
        Actions builder = new Actions(driver);
        builder.clickAndHold(slider).moveByOffset(-xOffset, 0).release().build().perform();
    }

    public void clickOKButton() {
        WebElement okButton = driver.findElement(By.xpath("//*[@class=\"button button_color_gray button_size_small slider-filter__button\"]"));
        okButton.click();
    }

    public void clickLargeIconsButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        By largeIconsButtonXPath = By.xpath("/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/rz-catalog-settings/div/rz-view-switch/div/button[1]");
        WebElement largeIconsButton = wait.until(ExpectedConditions.elementToBeClickable(largeIconsButtonXPath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", largeIconsButton);
        largeIconsButton.click();
    }

    public void clickSortDropDown() {
        WebElement SortDropDown = driver.findElement(By.xpath("/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/rz-catalog-settings/div/rz-sort/select"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SortDropDown);
        Select dropdown = new Select(SortDropDown);
        dropdown.selectByValue("1: cheap");
    }
    public void addFirstProdToTheCart() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        By productElementXPath = By.xpath("/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/section/rz-grid/ul/li[2]/rz-catalog-tile/app-goods-tile-default");
        WebElement productElement = driver.findElement(productElementXPath);
        Actions actions = new Actions(driver);
        actions.moveToElement(productElement).perform();
        By AddFirstProdToTheCartXpath = By.xpath("/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/section/rz-grid/ul/li[2]/rz-catalog-tile/app-goods-tile-default/div/div[2]/div[4]/div[2]/app-buy-button/button");
        WebElement AddFirstProdToTheCart = wait.until(ExpectedConditions.elementToBeClickable(AddFirstProdToTheCartXpath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddFirstProdToTheCart);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", AddFirstProdToTheCart);

    }
    public void addSecondProdToTheCart(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        By productElementXPath = By.xpath("/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/section/rz-grid/ul/li[1]/rz-catalog-tile/app-goods-tile-default/div/div[2]");
        WebElement productElement = driver.findElement(productElementXPath);
        Actions actions = new Actions(driver);
        actions.moveToElement(productElement).perform();
        By AddSecondProdToTheCartXpath = By.xpath("/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/section/rz-grid/ul/li[1]/rz-catalog-tile/app-goods-tile-default/div/div[2]/div[4]/div/app-buy-button/button");
        WebElement AddSecondProdToTheCart = wait.until(ExpectedConditions.elementToBeClickable(AddSecondProdToTheCartXpath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddSecondProdToTheCart);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", AddSecondProdToTheCart);
    }
    public void clickTheCart(){
        WebElement ClickTheCart = driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[7]/rz-cart/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClickTheCart);
        ClickTheCart.click();
    }
    public void removeProductWithHighestPriceFromCart() {
            WebElement removeButton = driver.findElement(By.xpath("//*[@id=\"cartProductActions0\"]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", removeButton);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", removeButton);
            WebDriverWait wait = new WebDriverWait(driver, 10);
            By removeButtonSecondXpath = By.xpath("//*[@id=\"cartProductActions0\"]/ul/li[1]/rz-trash-icon/button");
            WebElement removeButtonSecond = wait.until(ExpectedConditions.elementToBeClickable(removeButtonSecondXpath));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", removeButtonSecond);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", removeButtonSecond);
        }
    }
