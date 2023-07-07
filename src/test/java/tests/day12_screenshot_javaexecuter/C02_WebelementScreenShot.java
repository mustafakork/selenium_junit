package tests.day12_screenshot_javaexecuter;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.utilities.Testbase;

public class C02_WebelementScreenShot extends Testbase {

    @Test
    public void test01(){
//google gidelim
driver.get("https://www.google.com");
//arama cubuğuna nutella yazıp aratALIM
        //WebDriver aramacubuğu = driver.findElement(By.xpath("//*[@id=\"input\"]"));

bekle(2);

    }

}
