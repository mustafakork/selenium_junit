package tests.day08_ıframe;

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
        WebElement taşınacakElement= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement hedefgidecekElement = driver.findElement(By.xpath("(//div[@id=‘droppable’])[1]"));
        Actions actions=new Actions(driver);

        actions.dragAndDrop(taşınacakElement,hedefgidecekElement).perform();
        //3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin





    }
}
