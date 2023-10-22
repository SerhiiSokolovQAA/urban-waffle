package online.qastudy.automationpractice.apittests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTempFrom {
    static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    static int getAPITemperature() {
        String apiKey = "d487dc4d1e75e13db4a4e0b2122e7a99";
        String cityId = "2643743";

        RestAssured.baseURI = "http://api.openweathermap.org/data/2.5";
        Response response = RestAssured.given()
                .param("id", cityId)
                .param("appid", apiKey)
                .when()
                .get("/weather");

        Float apiTemperatureFloat = response.jsonPath().get("main.temp");
        double kelvinTemperature = apiTemperatureFloat;
        double celsiusTemperature = kelvinToCelsius(kelvinTemperature);
        return (int) celsiusTemperature;
    }
    // Код для сайта https://openweathermap.org/
    static int getWebTemperature(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"weather-widget\"]//*[@placeholder=\"Search city\"]")));
        inputField.sendKeys("London");
        WebElement searchButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"weather-widget\"]//*[@type=\"submit\"]")));
        executor.executeScript("arguments[0].click();", searchButton);
        WebElement searchResultButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"weather-widget\"]/div[1]/div/div/div[2]/div[1]/div/ul/li[1]/span[1]")));
        executor.executeScript("arguments[0].click();", searchResultButton);
        WebElement temperatureElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"weather-widget\"]//*[@class=\"heading\"]")));
        String webTemperatureText = temperatureElement.getText();
        webTemperatureText = webTemperatureText.replaceAll("[^0-9]", "");
        return Integer.parseInt(webTemperatureText);
    }

    // Код для сайта https://weather.com/
//    static int getWebTemperature(WebDriver driver) {
//    WebElement inputField = driver.findElement(By.xpath("//*[@id=\"LocationSearch_input\"]"));
//    inputField.sendKeys("London");
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"LocationSearch_listbox-5d3ac36b50e4aa01e9916508005d45eab1dffb15cb59d5b38cce3ca54d24c65d\"]")));
//    city.click();
//    WebElement temperatureElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"CurrentConditions--primary--2DOqs\"]//*[@class=\"CurrentConditions--tempValue--MHmYY\"]")));
//    String webTemperatureText = temperatureElement.getText();
//    webTemperatureText = webTemperatureText.split("°")[0].trim();
//    return Integer.parseInt(webTemperatureText);
//    }
}

