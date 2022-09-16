package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverCalculator {
    public DriverCalculator() {
    }
    static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> driver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.home")+"/Downloads/Calculator_v8.2 (453324893)_apkpure.com.apk");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsungy");

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        return driver;
    }


}
