package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChromePage3 {

    private AndroidDriver driver;

    private ChromePage3() {

    }

    public ChromePage3(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.EditText[@text='Search or type web address']")
    public WebElement textFeld;

    @FindBy(id = "com.android.chrome:id/terms_accept")
    public WebElement akzeptButton;

    @FindBy(id = "com.android.chrome:id/negative_button")
    public WebElement überspringButton;
}


