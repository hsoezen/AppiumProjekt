package elementeTeil1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Test1ErsteAppiumClass {
    public static void main(String[] args) throws MalformedURLException {

        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.home")+"/Downloads/Calculator_v8.2 (453324893)_apkpure.com.apk");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung 12");

        AndroidDriver<AndroidElement> driver;
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        WebElement sieben = driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
        sieben.click();
        System.out.println(sieben.getTagName());
        WebElement acht = driver.findElementById("com.google.android.calculator:id/digit_8");
        acht.click();

        List<AndroidElement> nummer = driver.findElements(By.className("android.widget.ImageButton"));

        for (WebElement w:nummer
             ) {
            System.out.println(w.getTagName());
            if(w.getTagName().equals("9")){
                w.click();
                System.out.println("9 wurde geklickt");
                break;
            }
        }

        driver.quit();
    }
}
