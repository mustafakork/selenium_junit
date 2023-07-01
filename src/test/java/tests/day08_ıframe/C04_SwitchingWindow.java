package tests.day08_ıframe;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.utilities.TestBaseQuit;

import java.util.Set;

public class C04_SwitchingWindow extends TestBaseQuit {
    @Test
    public void test01(){
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement openingElementi = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
        String expextedlementYazı="Opening a new window";
        String actuallementYazı=openingElementi.getText();
        Assert.assertEquals(expextedlementYazı,actuallementYazı);

        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.

        String expectedTitle="The Internet";
        String actualTitle =driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
String ilkSayfaWhd=driver.getWindowHandle();
        System.out.println(ilkSayfaWhd);
        // gorevde bu sayfaya geri donus oldugu icin handle degerini kaydedelim

        //● Click Here butonuna basın.
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
bekle(2);
        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.


        Set<String> wHDSeti = driver.getWindowHandles();
        System.out.println(wHDSeti);
        String ikincisayfaWhd="";
        for (String eachelement:  wHDSeti
             ) {

            if (!eachelement.equals(ilkSayfaWhd));

            ikincisayfaWhd=eachelement;

        }
        driver.switchTo().window(ikincisayfaWhd);
        expectedTitle ="New Window";
        actualTitle =driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);


        /*
            KONTROLUMUZ disinda yeni bir tab veya window acilinca
            driver otomatik olarak oraya gecmez
            Yeni sayfaya gecebilmek icin ikinci sayfanin Window Handle degerini bulmaliyiz
            Bunun icin

            1- ilk sayfada iken ilkSayfaWHD'ini kaydedelim
            2- yeni sayfayi acan linki tiklayalim
            3- ilk ve ikinci sayfanin window Handle Degerlerini bir Set olarak kaydedelim
                Set<String> wHDSeti = driver.getWindowHandles();
            4- Bir for-each loop ile Set'deki window handle degerlerini
               ilk sayfanin window handle degeri ile karsilastiralim
               ilkSayfaWHD'ne esit OLMAYAN window handle degerini
               ikinciSayfaWHD olarak kaydedelim
            5- buldugumuz  ikinciSayfaWHD'ni kullanarak 2.sayfaya gecelim
         */

        //● Sayfadaki textin “New Window” olduğunu doğrulayın.

        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
        bekle(4);
    }


}
