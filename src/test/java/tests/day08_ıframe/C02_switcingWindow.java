package tests.day08_ıframe;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import tests.utilities.TestBaseQuit;

public class C02_switcingWindow extends TestBaseQuit {


    @Test
    public void test01(){
// amazon ana sayfaya gidin
        driver.get("https://www.amazon.com");
// url'in amazon icerdigini test edin
        String expectedUrl ="amazon";
        String actualUrl =driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));

bekle(2);
// Yeni bir tab olarak wise quarter anasayfaya gidin
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.wisequarter.com");
        bekle(2);
// title'in Wise icerdigini test edin
        String expectedTitle ="Wise";
        String actualTitle =driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

// yeni bir window acarak youtube sayfasina gidin
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.youtube.com");
        bekle(2);
// url'in youtube icerdigini test edin.
        expectedUrl ="youtube";
        actualUrl =driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrl));

// acilan tum sayfalari kapatin



    }
}
