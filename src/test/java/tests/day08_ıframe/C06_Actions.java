package tests.day08_ıframe;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import tests.utilities.Testbase;

public class C06_Actions extends Testbase {


    @Test

    public void test01(){
        //1- https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");
        //2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
       Actions actions=new Actions(driver);
       bekle(2);
       actions.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")),driver.findElement(By.xpath("//div[@id='droppable'][1]"))).perform();
       bekle(2);
        //3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin

        WebElement dropedYazıElementi=driver.findElement(By.xpath("//p[text()='Dropped!']"));
        String expectedyazı = "Dropped!";
        String actualYazı=dropedYazıElementi.getText();

        Assert.assertEquals(expectedyazı,actualYazı);






    }
}
