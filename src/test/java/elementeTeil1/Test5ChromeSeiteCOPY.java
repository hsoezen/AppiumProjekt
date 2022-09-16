package elementeTeil1;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseApp;

import java.net.MalformedURLException;

public class Test5ChromeSeiteCOPY extends BaseApp {


    public static void main(String[] args) throws MalformedURLException, InterruptedException {

       AndroidDriver<AndroidElement> driver = driver();

        Actions actions = new Actions(driver);

        driver.findElementById("com.android.chrome:id/terms_accept").click();
        driver.findElementById("com.android.chrome:id/negative_button").click();
        WebElement textFeld = driver.findElementByXPath("//android.widget.EditText[@text='Search or type web address']");

        textFeld.sendKeys("fincon");
        Thread.sleep(1000);
        actions.sendKeys(Keys.ENTER).perform();
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Close']").click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(1000);
        //driver.quit();

    }
}

