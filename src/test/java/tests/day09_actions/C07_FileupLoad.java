package tests.day09_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.utilities.Testbase;

public class C07_FileupLoad extends Testbase {

    @Test
    public  void test01(){
        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        //chooseFile butonuna basalim




        /*
            Eger chooseFile butonuna basarsak
            bilgisayarimizin klasor yapisi acilir
            oradan dosya secmek icin mouse'u kullanamayacagimizdan
            bu yontemle dosya upload mumkun degildir
            Bunun yerine selenium'un bize sundugu cozumu kullaniyoruz
            chooseFile butonuna sendKeys ile
            yuklemek istedigimiz dosyanin dosyaYolunu gonderiyoruz
         */

        //masaüstüne kopladığımız   avatar.png doyasını seçelim

        WebElement chooseFilelementi= driver.findElement(By.id("file-upload"));
        String dinamikDosyaYolu = System.getProperty("user.home")+  "/desktop/avatar.png";
        chooseFilelementi.sendKeys(dinamikDosyaYolu);
        bekle(5);
        //upload butonuna basalım

        driver.findElement(By.id("file-submit")).click();
//"file uploaded"textetinin görüntülendiğini test edin

        WebElement fileUploadedElementi= driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));

        Assert.assertTrue(fileUploadedElementi.isDisplayed());
    }
}
