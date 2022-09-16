package elementeTeil1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ChromePage2;
import pages.ChromePage3;
import java.net.MalformedURLException;
import static utilities.DriverChrome.getDriver;

public class Test8ChromeSeite3 {
    @Test //ChromePage3 hat "AndroidWebdriver driver".
    public void main() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = getDriver();
        ChromePage3 chromePage3 = new ChromePage3(driver);
        Actions actions = new Actions(driver);

        chromePage3.akzeptButton.click();
        chromePage3.überspringButton.click();
        chromePage3.textFeld.sendKeys("er34");

        actions.sendKeys(Keys.ENTER).perform();

    }
}

