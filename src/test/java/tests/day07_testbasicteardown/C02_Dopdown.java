package tests.day07_testbasicteardown;

import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import tests.utilities.Testbase;

public class C02_Dopdown extends Testbase {

    @Test
    public  void test01(){
        // Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
// arama kutusunun yanindaki dropdown menude 28 secenek oldugunu test edin
        WebElement dropdownMenuElementi= driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        driver.findElement(By.xpath("//select[@aria-describedby=\"searchDropdownDescription\"]"));

        Select select = new Select(dropdownMenuElementi);
        int expectedoption    =28;
        int actualoptionsayı= select.getOptions().size();

        Assert.assertEquals(expectedoption,actualoptionsayı);
        bekle(2);
// dropdown menuden Baby kategorisini secin
        select.selectByVisibleText("Baby");
// Arama kutusuna Nutella yazip aratin

WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
aramaKutusu.sendKeys("nutella"+Keys.ENTER);
// bulunan sonuc sayisinin 5'dan fazla oldugunu test edin
        String  sonucyazısı =driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
        System.out.println(sonucyazısı);

        String sonucSayisiStr = sonucyazısı.substring(0,sonucyazısı.indexOf(" "));//"9"
        int sonuçyazıdeğeri = Integer.parseInt(sonucSayisiStr);
        Assert.assertTrue(sonuçyazıdeğeri>5);
// sectigimiz opsiyonu yazdirin

        dropdownMenuElementi=driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        select= new Select(dropdownMenuElementi);

        System.out.println(select.getFirstSelectedOption().getText());

// sectigimiz opsiyon'un Baby oldugunu test edin

        String seçiliElementoption="Baby";
        String actualselectoption= select.getFirstSelectedOption().getText();

Assert.assertEquals(seçiliElementoption,actualselectoption);

    }

}
