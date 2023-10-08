package ua.kyiv.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignInPage {

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(By.xpath("//div[3]/div/form/input[3]"));
        emailInput.sendKeys(email);
    }

    public void enterAlias(String alias) {
        WebElement emailInput = driver.findElement(By.xpath("//div[3]/div/form/input[2]"));
        emailInput.sendKeys(alias);
    }

    public CreateAccountPage clicksignup() {
        WebElement signupButton = driver.findElement(By.xpath("//div[3]/div/form/button"));
        signupButton.click();
        return new CreateAccountPage(driver);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordInput.sendKeys(password);
    }

    public void enterFirstName(String firstname) {
        WebElement firstnameInput = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
        firstnameInput.sendKeys(firstname);
    }

    public void enterLastName(String lastname) {
        WebElement lastnameInput = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
        lastnameInput.sendKeys(lastname);
    }

    public void enterAddress(String address) {
        WebElement addressInput = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
        addressInput.sendKeys(address);
    }

    public void enterState(String state) {
        WebElement stateInput = driver.findElement(By.xpath("//*[@id=\"state\"]"));
        stateInput.sendKeys(state);
    }

    public void enterCity(String city) {
        WebElement cityInput = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        cityInput.sendKeys(city);
    }

    public void enterZipcode(String zipcode) {
        WebElement zipcodeInput = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
        zipcodeInput.sendKeys(zipcode);
    }

    public void enterMobilePhone(String phone) {
        WebElement mobilephoneInput = driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
        mobilephoneInput.sendKeys(phone);
    }

    public CreateAccountPage clickCreateAccount() throws InterruptedException {
        WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"form\"]//div[1]/form/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createAccountButton);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        createAccountButton.click();
        return new CreateAccountPage(driver);
    }

    public void clickSelectMaleGender() {
        WebElement selectMaleGenderradioButton = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
        selectMaleGenderradioButton.click();
    }

    public void clickSignUpForNewsLetters() throws InterruptedException {
        WebElement signUpForNewsLetters = driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signUpForNewsLetters);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        signUpForNewsLetters.click();
    }

    public void clickReceiveOffers() throws InterruptedException {
        WebElement receiveOffers = driver.findElement(By.xpath("//*[@id=\"optin\"]"));
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        receiveOffers.click();
    }

    public void clickDay() {
        WebElement selectElement = driver.findElement(By.xpath("//*[@id='days']"));
        Select dropdown = new Select(selectElement);
        dropdown.selectByIndex(1);
    }

    public void clickMonth() {
        WebElement selectElement = driver.findElement(By.xpath("//*[@id=\"months\"]"));
        Select dropdown = new Select(selectElement);
        dropdown.selectByValue("6");
    }

    public void clickYear() {
        WebElement selectElement = driver.findElement(By.xpath("//*[@id=\"years\"]"));
        Select dropdown = new Select(selectElement);
        dropdown.selectByValue("2021");
    }

    public void clickDressesButton() throws InterruptedException {
        Thread.sleep(2000);
        WebElement dressesButton = driver.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a"));
        dressesButton.click();
    }

    public void clickViewProduct() throws InterruptedException {
        Thread.sleep(2000);
        WebElement viewProduct = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewProduct);
        driver.switchTo().defaultContent();
        viewProduct.click();
    }

    public void clickViewProductNew() throws InterruptedException {
        Thread.sleep(2000);
        WebElement viewProductNew = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[3]/div/div[2]/ul/li/a"));
        WebElement viewProduct = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewProduct);
        viewProductNew.click();
    }

    public void clickViewCart() throws InterruptedException {
        Thread.sleep(2000);
        WebElement viewcart = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u"));
        viewcart.click();
    }

    public void enterQuantity(String quantity) throws InterruptedException {
        Thread.sleep(2000);
        WebElement textField = driver.findElement(By.xpath("//*[@id='quantity']"));
        textField.clear();
        textField.sendKeys(quantity);
    }

    public void clickContinueShopping() throws InterruptedException {
        Thread.sleep(2000);
        WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"cartModal\"]//div[3]/button"));
        continueShopping.click();
    }
    public void clickAddToCart() throws InterruptedException {
        Thread.sleep(2000);
        WebElement addToCart = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button"));
        addToCart.click();
    }

    public String getTotalPriceForFirstItemInCart() {
        WebElement totalPriceElement = driver.findElement(By.xpath("//*[@id=\"product-3\"]/td[5]/p"));
        return totalPriceElement.getText();
    }
    public String getTotalPriceForSecondItemInCart() {
        WebElement totalPriceElement = driver.findElement(By.xpath("//*[@id=\"product-4\"]/td[5]/p"));
        return totalPriceElement.getText();
    }

    public class CreateAccountPage {
        private WebDriver driver;

        public CreateAccountPage(WebDriver driver) {
            this.driver = driver;
        }

        public void fillRegistrationForm(String firstName, String lastName, String password, String day, String month, String year, String postcode, String phone) {
        }

        public void clickRegister() {
        }

        public String getValidationMessage() throws InterruptedException {
            Thread.sleep(2000);
            String validationMessage = driver.getPageSource();
            return validationMessage;
        }

//    public String getValidationMessage() throws InterruptedException {
        //Thread.sleep(2000);
        //String validationMessage = driver.getPageSource();
        //String searchText = "Please fill out this field.";
        //return validationMessage;

    }
}
