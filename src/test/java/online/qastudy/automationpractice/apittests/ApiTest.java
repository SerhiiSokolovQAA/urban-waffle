package online.qastudy.automationpractice.apittests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.kyiv.prog.apitestsetup.ApiTestSetUp;
import static online.qastudy.automationpractice.apittests.GetTempFrom.getAPITemperature;
import static online.qastudy.automationpractice.apittests.GetTempFrom.getWebTemperature;

public class ApiTest extends ApiTestSetUp {
    @Test
    public void testTemperature() {
        double apiTemperature = getAPITemperature();
        double webTemperature = getWebTemperature(driver);
        Assert.assertEquals(webTemperature, apiTemperature, "Temp does not match");
    }
}