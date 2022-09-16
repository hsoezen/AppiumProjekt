package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class ChromePage  {

    private WebDriver driver;

    private ChromePage(){

    }
    public ChromePage(WebDriver driver) throws MalformedURLException {
        this.driver = driver;
                                                                                        //Driver ist Webdriver
                                                                                        //Die Elemente wurden with "WebElement" erstellt.
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.EditText[@text='Search or type web address']")
    public WebElement textFeld;

    @FindBy(id = "com.android.chrome:id/terms_accept")
    public WebElement akzeptButton;

    @FindBy(id = "com.android.chrome:id/negative_button")
    public WebElement überspringButton;
}
