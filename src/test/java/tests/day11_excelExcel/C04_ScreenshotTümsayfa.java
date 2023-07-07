package tests.day11_excelExcel;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import tests.utilities.Testbase;

import java.io.File;
import java.io.IOException;

public class C04_ScreenshotTümsayfa extends Testbase {

    @Test
    public  void test01() throws IOException {
        //amazon sayfasına gidin
        driver.get("https://www.amazon.com");

        //Nutella için arama yaptırın
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
aramakutusu.sendKeys("nutella"+ Keys.ENTER);


        //sonuçların NUTELLA  içerdiğini test edin

        TakesScreenshot tss = (TakesScreenshot) driver;
        File tümsayfaSS =new File("target/ekranScreenshot/tümsayfaSS");

        File geçicidosya =tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geçicidosya,tümsayfaSS);








    }
}
