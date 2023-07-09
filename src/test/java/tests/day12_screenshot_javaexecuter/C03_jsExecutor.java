package tests.day12_screenshot_javaexecuter;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import tests.utilities.Testbase;

public class C03_jsExecutor extends Testbase {

    @Test
    public void test01(){
        //wisequartes anasayfaya gidelim

        driver.get("https://www.wisequarter.com");

       //js executer kullanarak contact linkini tıklayın
        WebElement contanktLinkElementi = driver.findElement(By.xpath("//a[text()='Contact']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()",contanktLinkElementi);

        bekle(2);

        //aşagıda bulunan submit butonuna kadar aşağı inin
        //ve bu butona basın
        driver.navigate().back();

        WebElement submitButonu = driver.findElement(By.xpath("//em[text()='Submit']"));
    jse.executeScript("arguments[0].scrollIntoView(true)",submitButonu);

    bekle(2);

    submitButonu.click();





    }
}
