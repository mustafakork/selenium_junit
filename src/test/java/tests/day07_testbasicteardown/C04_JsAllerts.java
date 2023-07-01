package tests.day07_testbasicteardown;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import tests.utilities.Testbase;

public class C04_JsAllerts extends Testbase {
    /*
/*
        Bir testi calistirirken
        web sayfasi bize uyari verebilir(alert)
        EGER bu uyariyi sag click ile inspect edebiliyorsak
        bu bir HTML alert'dir
        ve diger tum HTML Webelement'ler gibi
        locate edilebilir ve kullanilabilirler
        ANCAK
        sag click yapip inspect edemiyorsak
        bunlar javascript alert olabilirler
        Js alert'ler locate edilemez
        sadece driver'imizi o alert'lere switch yapip
        o alert'lerde istenen islemleri yapabiliriz

     */

    @Test
    public void test01() {

        //- https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        driver.get(" https://the-internet.herokuapp.com/javascript_alerts");
        // - 1.alert’e tiklayin
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();


        // - Alert’deki yazinin “I am a JS Alert” oldugunu test edin

        String actualAlertYazısı = driver.switchTo().alert().getText();
        String expectedAlertYazısı = "I am a JS Alert";
        Assert.assertEquals(expectedAlertYazısı, actualAlertYazısı);
        // - OK tusuna basip alert’i kapatin
        driver.switchTo().alert().accept();
    }
        //2.Test
        // - https://the-internet.herokuapp.com/javascript_alerts adresine gidin
@Test
public void test02(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        // - 2.alert’e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
    // - Cancel’a basip, cikan sonuc yazisinin “You clicked: Cancel” oldugunu test edin
        driver.switchTo().alert().dismiss();
        String expectediçerik= "You clicked: Cancel";
        String actualiçerik =driver.findElement(By.xpath("//p[@id='result']")).getText();

        Assert.assertEquals(expectediçerik,actualiçerik);

    }
        @Test
                public void test03(){
            //3.Test
            // - https://the-internet.herokuapp.com/javascript_alerts adresine gidin
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            // - 3.alert’e tiklayalim
            driver.findElement(By.xpath("//*[text()='Click for JS Prompt']"));
            // - Cikan prompt ekranina “Abdullah” yazdiralim
            driver.switchTo().alert().sendKeys("abdullah");
            // - OK tusuna basarak alert’i kapatalim
            driver.switchTo().alert().accept();
            // - Cikan sonuc yazisinin Abdullah icerdigini test edelim
            String expectedyazı="abdullah";
            String actualyazı= driver.findElement(By.xpath("//p[@id='result']")).getText();

            Assert.assertTrue(actualyazı.contains(expectedyazı));

        }







}
