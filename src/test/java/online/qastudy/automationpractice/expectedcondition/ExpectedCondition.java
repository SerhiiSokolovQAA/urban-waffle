package online.qastudy.automationpractice.expectedcondition;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ua.kyiv.prog.expectedcondition.CustomExpectedConditions;
import ua.kyiv.prog.expectedcondition.CustomExpectedConditionsSetUp;

public class ExpectedCondition extends CustomExpectedConditionsSetUp {
    private CustomExpectedConditions customExpectedConditions;
    protected WebDriver driver;

    @Test
    public void expectedConditionsTest() {
        customExpectedConditions = new CustomExpectedConditions(driver);
        // 1) Ждем появления элемента
        customExpectedConditions.waitForElementToAppear();
        // 2) Ждем, пока элемент исчезнет
        customExpectedConditions.waitForElementToDisappear();
        // 3) Ждем отсутствие элемента
        customExpectedConditions.isElementAbsent();
        // 4) Ждем появления и исчезновения элемента
        customExpectedConditions.waitForElementToAppearAndDisappear();
         // 5) Ждем видимости элемента
        customExpectedConditions.waitForVisible();
        // 6) Ждем невидимости элемента
        customExpectedConditions.waitForInvisible();
        }
}

