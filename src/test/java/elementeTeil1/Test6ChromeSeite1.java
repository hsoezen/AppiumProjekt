package elementeTeil1;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.ChromePage;
import java.net.MalformedURLException;
import static utilities.DriverChrome.getDriver;

public class Test6ChromeSeite1 {
    @Test //ChromePage hat "WebDriver driver"
    public void test() throws MalformedURLException {

        WebDriver driver = getDriver();
        ChromePage chromePage = new ChromePage(driver);
        Actions actions = new Actions(driver);

        chromePage.akzeptButton.click();
        chromePage.überspringButton.click();
        chromePage.textFeld.sendKeys("Husamettin");

        actions.sendKeys(Keys.ENTER).perform();
    }
}
