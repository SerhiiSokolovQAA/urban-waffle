package ua.kyiv.prog.expectedcondition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class CustomExpectedConditions {

    private WebDriver driver;

    @FindBy(xpath = "")
    private WebElement elementToAppear;

    @FindBy(xpath = "")
    private WebElement elementToDisappear;

    @FindBy(xpath = "")
    private WebElement elementAbsent;

    @FindBy(xpath = "")
    private WebElement elementToAppearAndDisappear;

    @FindBy(xpath = "")
    private WebElement forVisible;

    @FindBy(xpath = "")
    private WebElement forInvisible;


    public CustomExpectedConditions (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitForElementToAppear() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) elementToAppear));
        Assert.assertTrue(elementToAppear.isDisplayed(), "Element is not visible");
    }

    public void waitForElementToDisappear() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated((By) elementToDisappear));
        Assert.assertFalse(elementToDisappear.isDisplayed(), "Element is visible");
    }

    public void isElementAbsent() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated((By) elementAbsent));
        Assert.assertFalse(elementAbsent.isDisplayed(), "Element is visible");
    }

    public void waitForVisible() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) forVisible));
        Assert.assertTrue(forVisible.isDisplayed(), "Element is not visible");
    }

    public void waitForInvisible() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated((By) forInvisible));
        Assert.assertFalse(forInvisible.isDisplayed(), "Element is visible");
    }

    public void waitForElementToAppearAndDisappear() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) elementToAppearAndDisappear));
        Assert.assertTrue(elementToAppearAndDisappear.isDisplayed(), "Element is not visible");
        wait.until(ExpectedConditions.invisibilityOf(elementToAppearAndDisappear));
        Assert.assertFalse(elementToAppearAndDisappear.isDisplayed(), "Element is visible");
    }
}