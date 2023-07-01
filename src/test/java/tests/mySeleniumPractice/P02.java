package tests.mySeleniumPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.utilities.Testbase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class P02 extends Testbase {
    @Test
    public void Test01(){
        //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
        //2) sayfadaki iframe sayısını bulunuz.


        //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
       WebElement iframeelementiTagı= driver.findElement(By.xpath("//iframe[@frameborder='0'][1]"));
       driver.switchTo().frame(iframeelementiTagı);

       WebElement playButtoelementi= driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        playButtoelementi.click();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ;

        //4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().defaultContent();

        //2.iframegeçiş
        driver.switchTo().frame("a077aa5e");
        //5) ikinci iframe'deki (Jmeter Made Easy)
        WebElement jmetertuşelementi= driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
        jmetertuşelementi.click();


        // linke (https://www.guru99.com/live-selenium-project.html) tıklayınız




    }
}
