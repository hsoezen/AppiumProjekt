package elementeTeil1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Test5ChromeSeite {
    static AndroidDriver<AndroidElement> driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        Demo2();

        Actions actions = new Actions(driver);

        driver.findElementById("com.android.chrome:id/terms_accept").click();
        driver.findElementById("com.android.chrome:id/negative_button").click();
        WebElement textFeld = driver.findElementByXPath("//android.widget.EditText[@text='Search or type web address']");

        textFeld.sendKeys("fincon");
        Thread.sleep(1000);
        //actions.sendKeys(Keys.ENTER).perform();

        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Close']").click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(1000);
        //driver.quit();
    }
    public static void Demo2() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        //capabilities.setCapability("deviceName", "PIXEL 2 API 30");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");

        capabilities.setCapability("appPackage", "com.android.chrome");
        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.IntentDispatcher");

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

