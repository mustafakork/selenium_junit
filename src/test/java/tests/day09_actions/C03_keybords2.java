package tests.day09_actions;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import tests.utilities.Testbase;

public class C03_keybords2 extends Testbase {

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
        Faker faker =new Faker();
        String emailFaker=  faker.internet().emailAddress();
        actions.click(adelementi)
                .sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB)
                  .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(emailFaker)
                .sendKeys(Keys.TAB)
                .sendKeys(emailFaker)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("5")
                .sendKeys(Keys.TAB)
                .sendKeys("Mar")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .perform();
        bekle(3);
        //4- Kaydol tusuna basalim
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        bekle(10);
        bekle(10);

    }

}
