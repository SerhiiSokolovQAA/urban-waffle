package ua.kyiv.prog.automationexperience;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignInPage {

    private static WebDriver driver;



    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[3]/div/form/input[3]")
    public WebElement emailInput;

    @FindBy(xpath = "//div[3]/div/form/input[2]")
    public WebElement aliaslInput;

    @FindBy(xpath = "//div[3]/div/form/button")
    public WebElement signupButton;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"first_name\"]")
    public WebElement firstnameInput;

    @FindBy(xpath = "//*[@id=\"last_name\"]")
    public WebElement lastnameInput;

    @FindBy(xpath = "//*[@id=\"address1\"]")
    public WebElement addressInput;

    @FindBy(xpath = "//*[@id=\"state\"]")
    public WebElement stateInput;

    @FindBy(xpath = "//*[@id=\"city\"]")
    public WebElement enterCity;

    @FindBy(xpath = "//*[@id=\"zipcode\"]")
    public WebElement zipcodeInput;

    @FindBy(xpath = "//*[@id=\"mobile_number\"]")
    public WebElement mobilephoneInput;

    @FindBy(xpath = "//*[@id=\"form\"]//div[1]/form/button")
    public WebElement createAccountButton;

    @FindBy(xpath = "//*[@id=\"id_gender1\"]")
    public WebElement selectMaleGenderradioButton;

    @FindBy(xpath = "//*[@id=\"newsletter\"]")
    public WebElement signUpForNewsLetters;

    @FindBy(xpath = "//*[@id=\"optin\"]")
    public WebElement receiveOffers;

    @FindBy(xpath = "//*[@id='days']")
    public WebElement selectdayfromropdown;

    @FindBy(xpath = "//*[@id=\"months\"]")
    public WebElement selectmonthfromropdown;

    @FindBy(xpath = "//*[@id=\"years\"]")
    public WebElement selectyeardropdown;

    @FindBy(xpath = "//*[@id=\"Women\"]/div/ul/li[1]/a")
    public WebElement dressesButton;

    @FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a")
    public WebElement viewProduct;

    @FindBy(xpath = "//*[@href='/product_details/28']//*[@class='fa fa-plus-square']")
    public WebElement viewProductSecond;

    @FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div/div[3]/div/div[2]/ul/li/a")
    public WebElement viewProductNew;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")
    public WebElement viewcart;

    @FindBy(xpath = "//*[@id='quantity']")
    public WebElement quantityField;

    @FindBy(xpath = "//*[@id=\"cartModal\"]//div[3]/button")
    public WebElement continueShopping;

    @FindBy(xpath = "//*[@id=\"accordian\"]/div[2]/div[1]/h4/a/span/i")
    public WebElement menButton;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
    public WebElement addToCart;

    @FindBy(xpath = "//*[@id=\"product-3\"]/td[5]/p")
    public WebElement totalPriceElement;

    @FindBy(xpath = "//*[@id=\"product-4\"]/td[5]/p")
    public WebElement totalPriceElementSecond;

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"accordian\"]/div[1]//h4/a/span/i")
    public WebElement womenButton;

    @FindBy(xpath = "//*[@href='/category_products/3']")
    public WebElement tshirtsButton;

    @FindBy(xpath = "//*[@src='/get_product_picture/28']")
    public WebElement purecottontShirt;

    @FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/div/a")
    public WebElement addtocartbuttoninpopupmenu;

    @FindBy(xpath = "//*[@href='/view_cart']//*[@class='fa fa-shopping-cart']")
    public WebElement cartButton;

    @FindBy(xpath = "//*[@id=\"product-3\"]/td[2]/p | //*[@id=\"product-28\"]/td[5]/p")
    List<WebElement> listofitemsinthecart;

    @FindBy(xpath = "//*[@id=\"form\"]//*[@data-qa='login-email']")
    public WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"form\"]//*[@data-qa='login-password']")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"form\"]//*[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@href=\"/login\"]//*[@class='fa fa-lock']")
    public WebElement loginSingUpButton;

    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement checkoutButton;

    @FindBy(xpath = "//*[@id='address_delivery']")
    public WebElement deliveryAddress;

    @FindBy(xpath = "//*[@id='address_invoice']")
    public WebElement billingAddress;

    @FindBy(xpath = "//*[@id='address_delivery']//*[@class='address_firstname address_lastname']")
    public WebElement deliveryFirstAndLastName;

    @FindBy(xpath = "//*[@id='address_invoice']//*[@class='address_firstname address_lastname']")
    public WebElement billingFirstAndLastName;

    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[4]")
    public WebElement deliveryAddressLine;

    @FindBy(xpath = "//*[@id=\"address_invoice\"]/li[4]")
    public WebElement invoiceAddressLine;

    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[6]")
    public WebElement deliveryAddressLineTwo;

    @FindBy(xpath = "//*[@id=\"address_invoice\"]/li[6]")
    public WebElement invoiceAddressLineTwo;

    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[7]")
    public WebElement deliveryCountry;

    @FindBy(xpath = "//*[@id=\"address_invoice\"]/li[7]")
    public WebElement invoiceCountry;

    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[7]")
    public WebElement deliveryPhone;

    @FindBy(xpath = "//*[@id=\"address_invoice\"]/li[7]")
    public WebElement invoicePhone;

    @FindBy(xpath = "//*[@id=\"product-3\"]/td[5]/p")
    public WebElement firstItemInTheCart;

    @FindBy(xpath = "//*[@id=\"product-28\"]/td[5]/p")
    public WebElement secondItemInTheCart;

    @FindBy(xpath = "//*[@id=\"cart_info\"]/table/tbody/tr[3]/td[4]/p")
    public WebElement totalPriceTheCart;


    public SignInPage clickSignIn() {
        signInButton.click();
        return new SignInPage(driver);
    }

    public SignInPage clickCheckoutButton() {
        cartButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(checkoutButton));
        checkoutButton.click();
        return new SignInPage(driver);
    }

    public SignInPage doLigInWithExistingUser() {
        loginSingUpButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(usernameField));
        usernameField.sendKeys("example+115@example.com");
        passwordField.sendKeys("P@ssw0rd");
        loginButton.click();
        return new SignInPage(driver);
    }

    public SignInPage clickCartButton() {
        cartButton.click();
        return new SignInPage(driver);
    }

    public SignInPage assertItemsArePresentInTheCart() {
        Assert.assertTrue(listofitemsinthecart.size() > 1, "Number of items in the cart is wrong");
        return new SignInPage(driver);
    }

    public SignInPage assertPricesInTheCart() {
        String textOfTheFirstItemInTheCart = firstItemInTheCart.getText();
        Pattern patternOfTheFirstItemInTheCart = Pattern.compile("\\d+");
        Matcher matcherOfTheFirstItemInTheCart = patternOfTheFirstItemInTheCart.matcher(textOfTheFirstItemInTheCart);
        StringBuilder digitsOfTheFirstItemInTheCart = new StringBuilder();
        while (matcherOfTheFirstItemInTheCart.find()) {
            digitsOfTheFirstItemInTheCart.append(matcherOfTheFirstItemInTheCart.group());
        }

        String textsecondItemInTheCart = secondItemInTheCart.getText();
        Pattern patternsecondItemInTheCart = Pattern.compile("\\d+");
        Matcher matchersecondItemInTheCart = patternsecondItemInTheCart.matcher(textsecondItemInTheCart);
        StringBuilder digitssecondItemInTheCart = new StringBuilder();
        while (matchersecondItemInTheCart.find()) {
            digitssecondItemInTheCart.append(matchersecondItemInTheCart.group());
        }

        String texttotalPriceTheCart = totalPriceTheCart.getText();
        Pattern patterntotalPriceTheCart = Pattern.compile("\\d+");
        Matcher matchertotalPriceTheCart = patterntotalPriceTheCart.matcher(texttotalPriceTheCart);
        StringBuilder digitstotalPriceTheCart = new StringBuilder();
        while (matchertotalPriceTheCart.find()) {
            digitstotalPriceTheCart.append(matchertotalPriceTheCart.group());
        }
        int firstNumber = Integer.parseInt(digitssecondItemInTheCart.toString());
        int secondNumber = Integer.parseInt(digitsOfTheFirstItemInTheCart.toString());
        int expectedSum = Integer.parseInt(digitstotalPriceTheCart.toString());
        int actualSum = firstNumber + secondNumber;

        Assert.assertEquals(expectedSum, actualSum, "Total sum does not match");

        return new SignInPage(driver);
    }

    public SignInPage assertAddressesAreEqual() {
        String getDeliveryFirstAndLastName = deliveryFirstAndLastName.getText();
        String getBillingFirstAndLastName = billingFirstAndLastName.getText();
        String getDeliveryAddressLine = deliveryAddressLine.getText();
        String getInvoiceAddressLine = invoiceAddressLine.getText();
        String getDeliveryAddressLineTwo = deliveryAddressLineTwo.getText();
        String getInvoiceAddressLineTwo = invoiceAddressLineTwo.getText();
        String getDeliveryCountry = deliveryCountry.getText();
        String getInvoiceCountry = invoiceCountry.getText();
        String getDeliveryPhone = deliveryPhone.getText();
        String getInvoicePhone = invoicePhone.getText();
        Assert.assertEquals(getDeliveryFirstAndLastName, getBillingFirstAndLastName, "Names does not match");
        Assert.assertEquals(getDeliveryAddressLine, getInvoiceAddressLine, "Addresses does not match");
        Assert.assertEquals(getDeliveryAddressLineTwo, getInvoiceAddressLineTwo, "Second addresses does not match");
        Assert.assertEquals(getDeliveryCountry, getInvoiceCountry, "Country does not match");
        Assert.assertEquals(getDeliveryPhone, getInvoicePhone, "Phone numbers does not match");
        return new SignInPage(driver);
    }

    public SignInPage clickAddToCartButtonInPopupMenu() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions actions = new Actions(driver);
        actions.moveToElement(purecottontShirt).perform();
        WebElement addtocartbuttoninpopup = wait.until(ExpectedConditions.visibilityOf(addtocartbuttoninpopupmenu));
        //((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", addtocartbuttoninpopupmenu);
        Thread.sleep(2000);
        this.driver.switchTo().defaultContent();
        addtocartbuttoninpopup.click();
        return new SignInPage(driver);
    }
    public SignInPage clickWomenButton() {
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", womenButton);
        this.driver.switchTo().defaultContent();
        womenButton.click();
        return new SignInPage(this.driver);
    }

    public SignInPage clickmenButton() {
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", menButton);
        this.driver.switchTo().defaultContent();
        menButton.click();
        return new SignInPage(this.driver);
    }

    public SignInPage clickTshirtsButton() throws InterruptedException {
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", tshirtsButton);
        this.driver.switchTo().defaultContent();
        tshirtsButton.click();
        return new SignInPage(this.driver);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterAlias(String alias) {
        aliaslInput.sendKeys(alias);
    }

    public CreateAccountPage clicksignup() {
        signupButton.click();
        return new CreateAccountPage(driver);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }
    public String getResultForPLN() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "return document.evaluate('/html/body/div[3]/div[3]/div/div[1]/div[2]/div[1]/div/table/tbody/tr[3]/td[1]/span/span[1]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;";
        WebElement resultElement = (WebElement) jsExecutor.executeScript(script);
        String valueOnWebsite = resultElement.getText();
        return valueOnWebsite;
    }
    public int manipulateAndMultiplyResultForPLN() {
        String textValue = getResultForPLN();
        double numericValue = Double.parseDouble(textValue);
        double result = numericValue * 100;
        return  (int) result;
    }
    public String getResultForUSD() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "return document.evaluate('/html/body/div[3]/div[3]/div/div[1]/div[2]/div[1]/div/table/tbody/tr[1]/td[1]/span/span[1]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;";
        WebElement resultElement = (WebElement) jsExecutor.executeScript(script);
        String valueOnWebsite = resultElement.getText();
        return valueOnWebsite;
    }
    public int manipulateAndMultiplyResultForUSD() {
        String textValue = getResultForUSD();
        double numericValue = Double.parseDouble(textValue);
        double result = numericValue * 100;
        return  (int) result;
    }
    public String getResultForUER() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "return document.evaluate('/html/body/div[3]/div[3]/div/div[1]/div[2]/div[1]/div/table/tbody/tr[2]/td[1]/span/span[1]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;";
        WebElement resultElement = (WebElement) jsExecutor.executeScript(script);
        String valueOnWebsite = resultElement.getText();
        return valueOnWebsite;
    }
    public int manipulateAndMultiplyResultForEUR() {
        String textValue = getResultForUER();
        double numericValue = Double.parseDouble(textValue);
        double result = numericValue * 100;
        return  (int) result;
    }
    public void enterFirstName(String firstname) {
        firstnameInput.sendKeys(firstname);
    }

    public void enterLastName(String lastname) {
        lastnameInput.sendKeys(lastname);
    }

    public void enterAddress(String address) {
        addressInput.sendKeys(address);
    }

    public void enterState(String state) {
        stateInput.sendKeys(state);
    }

    public void enterCity(String city) {
        enterCity.sendKeys(city);
    }

    public void enterZipcode(String zipcode) {
        zipcodeInput.sendKeys(zipcode);
    }

    public void enterMobilePhone(String phone) {
        mobilephoneInput.sendKeys(phone);
    }

    public CreateAccountPage clickCreateAccount() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createAccountButton);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        createAccountButton.click();
        return new CreateAccountPage(driver);
    }

    public void clickSelectMaleGender() {
        selectMaleGenderradioButton.click();
    }

    public void clickSignUpForNewsLetters() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signUpForNewsLetters);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        signUpForNewsLetters.click();
    }

    public void clickReceiveOffers() throws InterruptedException {
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        receiveOffers.click();
    }

    public void clickDay() {
        Select dayfromropdown = new Select(selectdayfromropdown);
        dayfromropdown.selectByIndex(1);
    }

    public void clickMonth() {
        Select dropdown = new Select(selectmonthfromropdown);
        dropdown.selectByValue("6");
    }

    public void clickYear() {
        Select yeardropdown = new Select(selectyeardropdown);
        yeardropdown.selectByValue("2021");
    }

    public void clickDressesButton() {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.elementToBeClickable(dressesButton));
        dressesButton.click();
    }
    public void clickViewProduct() throws InterruptedException {
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewProduct);
        driver.switchTo().defaultContent();
        viewProduct.click();
    }

    public void clickViewProductSecond() throws InterruptedException {
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewProductSecond);
        driver.switchTo().defaultContent();
        viewProductSecond.click();
    }
    public void clickViewProductNew() throws InterruptedException {
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewProductNew);
        viewProductNew.click();
    }
    public void clickViewCart() throws InterruptedException {
        Thread.sleep(2000);
        viewcart.click();
    }
    public void enterQuantity(String quantity) throws InterruptedException {
        Thread.sleep(2000);
        quantityField.clear();
        quantityField.sendKeys(quantity);
    }
    public void clickContinueShopping() throws InterruptedException {
        Thread.sleep(2000);
        continueShopping.click();
    }
    public void clickAddToCart() throws InterruptedException {
        Thread.sleep(2000);
        addToCart.click();
    }
    public String getTotalPriceForFirstItemInCart() {
        return totalPriceElement.getText();
    }
    public String getTotalPriceForSecondItemInCart() {
        return totalPriceElementSecond.getText();
    }
    public String getPageSource() {
        return driver.getPageSource();
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
            String searchText = "Please fill out this field.";
            return validationMessage;

        }
    }
}
