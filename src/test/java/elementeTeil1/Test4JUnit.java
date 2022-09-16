package elementeTeil1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test4JUnit {

    private AndroidDriver<AndroidElement> driver;

    @Before
    public void setUp() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.home")+"/Downloads/Calculator_v8.2 (453324893)_apkpure.com.apk");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung 11");

        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void multipieren() throws InterruptedException {
        List<AndroidElement> tasten = driver.findElements(By.className("android.widget.ImageButton"));

        for (WebElement w : tasten
        ) {
            if (w.getTagName().equals("9")) {
                System.out.println(w.getTagName());
                w.click();
                break;
            }
        }

    }
}
