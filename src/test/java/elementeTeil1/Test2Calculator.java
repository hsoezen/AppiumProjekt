package elementeTeil1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.DriverCalculator;

import java.net.MalformedURLException;
import java.util.List;


public class Test2Calculator extends DriverCalculator {
    public static void rechnen1(String a, String b, String c, String d) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = driver();

        List<AndroidElement> Tasten = driver.findElements(By.className("android.widget.ImageButton"));

        //String a
        String ZahlTeile1[] = a.split("");

        for (String z : ZahlTeile1
        ) {
            for (WebElement w : Tasten
            ) {
                if (w.getTagName().equals(z)) {
                    w.click();
                    System.out.println("Auf " + z + " wurde geklickt");
                    break;
                }
            }
        }

        //String b
        for (WebElement w : Tasten
        ) {
            if (w.getTagName().equals(b)) {
                w.click();
                System.out.println("Auf " + b + " wurde geklickt");
                break;
            }
        }

        //String c
        String ZahlTeile2[] = c.split("");
        for (String k : ZahlTeile2
        ) {
            for (WebElement w : Tasten
            ) {
                if (w.getTagName().equals(k)) {
                    w.click();
                    System.out.println("Auf " + k + " wurde geklickt");
                    break;
                }
            }
        }

        //String d
        for (WebElement w : Tasten
        ) {
            if (w.getTagName().equals(d)) {
                w.click();
                System.out.println("Auf " + d + " wurde geklickt");
                break;
            }
        }
        String rechnen = b;
        int erwartetesErgebnis=0;

        switch (rechnen) {
            case "plus":
                erwartetesErgebnis = Integer.valueOf(a) + Integer.valueOf(c);
                break;
            case "minus":
                erwartetesErgebnis = Integer.valueOf(a) - Integer.valueOf(c);
                System.out.println("ZwischenErgebnis =" +erwartetesErgebnis);
                break;
            case "multiply":
                erwartetesErgebnis = Integer.valueOf(a) * Integer.valueOf(c);
                break;
            case "divide":
                erwartetesErgebnis = Integer.valueOf(a) / Integer.valueOf(c);
                break;

        }
        System.out.println("Erwartetes Ergebnis =" + erwartetesErgebnis);

        WebElement Ergebnis =driver.findElementById("com.google.android.calculator:id/result_final");

        int aktuellErgebnis = Integer.valueOf(Ergebnis.getText());
        Assert.assertEquals(erwartetesErgebnis, aktuellErgebnis);
/*
        List<AndroidElement> list = driver.findElementsByXPath("//*[@package='com.google.android.calculator']");
        for (int i = 0; i < list.size(); i++) {

            //System.out.println(w.getTagName());
            System.out.println(list.get(i).getText());
            System.out.println(list.get(i).getTagName());
        }

 */

    }

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        rechnen1("625", "divide", "5", "equals");

        //driver().quit();
    }
}
