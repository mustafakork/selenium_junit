package tests.day08_ıframe;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.utilities.Testbase;

public class C01_Iframe extends Testbase {

    @Test
    public void iframe(){
//1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get("https://the-internet.herokuapp.com/iframe");
// 2 ) Bir metod olusturun: iframeTest
        // - “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.
        WebElement aniframe = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(aniframe.isEnabled());
        System.out.println(aniframe.getText());
        /*
        /*
        Textbox elementi gozumuzun onunde olmasina
        ve rahatca locate edilebilmesine ragmen direk kullanilamiyor
        HTML kodlarini inceleyince
        textbox'in bir iFrame icerisinde oldugunu gorduk
        textbox'i kullanmadan once iframe'e gecis yapmaliyiz
         */

//iframe geçiş
        WebElement iframeelementi = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframeelementi);
        // driver.switchTo().frame("mce_0_ifr"); da olur
bekle(5);
        WebElement textbox = driver.findElement(By.tagName("p"));
        //textbox           temizleme
        textbox.clear();
        // - Text Box’a “Merhaba Dunya!” yazin.
        textbox.sendKeys("merhaba dünya");
bekle(5);
         /*
            Bir iFrame gecis yapildiysa
            normal sayfada islem yapilamaz
            normal sayfada islem yapmak isterseniz
            iFrame'den cikmaniz gerekir
            defaultContent() : ana sayfaya cikar
            parentFrame() : eger ic ice iFrame'ler varsa, bir ust iFrame'e cikar
         */

        // - TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur

        // oldugunu dogrulayin ve  konsolda yazdirin.
        driver.switchTo().defaultContent();
        WebElement elementalSeleniumElementi = driver.findElement(By.xpath("//*[text() ='Elemental Selenium']"));
Assert.assertTrue(elementalSeleniumElementi.isDisplayed());



    }


}
