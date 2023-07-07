package tests.day11_excelExcel;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
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

        WebElement sonuçelementi = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
    String expectediçerik ="nutella";
    String actualsonuçiçerik= sonuçelementi.getText();

        Assert.assertTrue(actualsonuçiçerik.contains(expectediçerik));

        //fotoğrafını çekmke için 4adıma ihtiyaç var
        //1.adım :  driveri TakesScreensho  OBJESİNE CAST EDELİM
        TakesScreenshot tss = (TakesScreenshot) driver;
        File tümsayfaSS =new File("target/ekranScreenshot/tümsayfaSS1");

        File geçicidosya =tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geçicidosya,tümsayfaSS);










    }
}
