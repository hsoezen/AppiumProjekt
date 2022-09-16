package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
public class ChromePage2 {

    private AndroidDriver driver;

    private ChromePage2() {

    }
                                                                                    //Driver ist AndroidDriver.
                                                                                    //Die Elemente wurden mit "AndroidElement" erstellt.
    public ChromePage2(AndroidDriver driver) {
        //this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);   //Wir verwenden AppiumFielDecorator.
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Search or type web address']")
    public AndroidElement textFeld;

    @AndroidFindBy(id = "com.android.chrome:id/terms_accept")
    public AndroidElement akzeptButton;

    @AndroidFindBy(id = "com.android.chrome:id/negative_button")
    public AndroidElement überspringButton;
}
