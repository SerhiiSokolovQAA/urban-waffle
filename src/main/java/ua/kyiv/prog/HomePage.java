package ua.kyiv.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public SignInPage clickSignIn() {
        WebElement signInButton = driver.findElement(By.xpath("//*[@href='/login']"));
        signInButton.click();
        return new SignInPage(driver);
    }
    public SignInPage clickWomenButton() {
        WebElement womenButton = driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]//h4/a/span/i"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenButton);
        driver.switchTo().defaultContent();
        womenButton.click();
        return new SignInPage(driver);
    }

}
