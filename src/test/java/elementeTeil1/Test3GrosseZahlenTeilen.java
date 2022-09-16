package elementeTeil1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Test3GrosseZahlenTeilen {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.home")+"/Downloads/Calculator_v8.2 (453324893)_apkpure.com.apk");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung 12");

        AndroidDriver<AndroidElement> driver;
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


        List<AndroidElement> nummer = driver.findElements(By.className("android.widget.ImageButton"));

        String zahl = "123";                                //Zum Bekommen die Zahlen einzelnen.
        String arr[] = zahl.split("");                  //z.B: 123 ->als  1   2   3

        for (String z : arr
        ) {
            for (WebElement w : nummer
            ) {
                System.out.println(w.getTagName());
                if (w.getTagName().equals(z)) {
                    w.click();
                    System.out.println(z + "wurde geklickt");
                    break;
                }
            }
        }
    }
}
