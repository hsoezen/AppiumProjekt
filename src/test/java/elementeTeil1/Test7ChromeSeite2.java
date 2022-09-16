package elementeTeil1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ChromePage2;
import java.net.MalformedURLException;
import static utilities.DriverChrome.getDriver;

public class Test7ChromeSeite2 {

    @Test //ChromePage2 hat "AndroidWebdriver driver".
    public void main() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = getDriver();
        ChromePage2 chromePage2 = new ChromePage2(driver);
        Actions actions = new Actions(driver);

        chromePage2.akzeptButton.click();
        chromePage2.überspringButton.click();
        chromePage2.textFeld.sendKeys("er34");

        actions.sendKeys(Keys.ENTER).perform();

    }
}
