package tests.day07_testbasicteardown;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import tests.utilities.Testbase;

import java.util.List;

public class C03_ extends Testbase {

    @Test
    public   void test01(){


    //● https://the-internet.herokuapp.com/dropdown adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dropdown");

    // 1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        WebElement dropdown  = driver.findElement(By.id("dropdown"));
        Select select =new Select(dropdown);
        select.selectByIndex(1);

        System.out.println("index ile seçilen option 1"+select.getFirstSelectedOption().getText());

        // 2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
        select.selectByValue("2");

        System.out.println("value ile seçilen option2" + select.getFirstSelectedOption().getText());



    // 3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    select.selectByVisibleText("Option 1");
        // 4.Tüm dropdown değerleri(value) yazdırın
        List<WebElement>  optionelementList=select.getOptions();
        for (WebElement  eachElement: optionelementList
             ) {
            System.out.println(eachElement.getText());

        }

    // 5. Dropdown’un boyutunun 4 olduğunu test edin
        int expectedoption  =3;
        int actualoption =optionelementList.size();

        Assert.assertEquals(expectedoption,actualoption);
}}
