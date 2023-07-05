package tests.day10_wait_cookies;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import tests.utilities.Testbase;

public class C03_WebTables extends Testbase {

    @Test
    public void test01(){

        driver.get("https://www.amazon.com");

        Actions actions =new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement tableTümBodyElementi = driver.findElement(By.xpath("//tbody"));
        System.out.println(tableTümBodyElementi.getText());


    }


}
