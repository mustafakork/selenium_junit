package tests.day09_actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import tests.utilities.Testbase;

public class C03_keybords extends Testbase {

    @Test
    public void test01(){


//1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
//2- Yeni hesap olustur butonuna basalim
       driver.findElement(By.xpath("//*[text()='Yeni hesap oluştur']")).click();
       bekle(10);

//3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
//4- Kaydol tusuna basalim


        Actions actions=new Actions(driver);
        WebElement adelementi= driver.findElement(By.name("firstname"));

        actions.click(adelementi)
                .sendKeys("muko")
                .sendKeys(Keys.TAB)
                .sendKeys("kork")
                .sendKeys(Keys.TAB)
                .sendKeys("asdeff@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("asdeff@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("1122").perform();

    }

}
