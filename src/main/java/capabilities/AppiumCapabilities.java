package capabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testobject.appium.junit.TestObjectTestResultWatcher;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumCapabilities {

    protected static AppiumDriver driver;

    protected static void setting() throws MalformedURLException {
        String platformName = "iOS";
        String TESTOBJECT_API_KEY;

        if (platformName.equals("Android")) {
            TESTOBJECT_API_KEY = "80161C478A2744FB98E7FA840721607D"; // android
        } else {
            TESTOBJECT_API_KEY = "26E470D4126142D9802417C7A0CCA5BB"; // iOS
        }

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("testobject_api_key", TESTOBJECT_API_KEY);
        // Dynamic device allocation of an iPhone 7, running iOS 10.3 device
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("deviceName", "iPhone_5_16GB_real");   //LG_Nexus_5X_free
        capabilities.setCapability("autoAcceptAlerts", true);

        // Set allocation from private device pool only
        capabilities.setCapability("privateDevicesOnly", "false");

        // Set Application under test
        capabilities.setCapability("testobject_app_id", "1");
        capabilities.setCapability("name", "ScatterSlotsIOS");

        // Set Appium version
        capabilities.setCapability("appiumVersion", "1.6.5");

        URL EU_endpoint = new URL("https://eu1.appium.testobject.com/wd/hub");
        URL US_endpoint = new URL("https://us1.appium.testobject.com/wd/hub");

        driver = new IOSDriver(EU_endpoint, capabilities);
        driver.getCapabilities().getCapability("testobject_test_report_url");
        driver.getCapabilities().getCapability("testobject_test_live_view_url");
    }
}
