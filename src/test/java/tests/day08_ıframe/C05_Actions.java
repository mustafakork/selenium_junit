package tests.day08_ıframe;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import tests.utilities.Testbase;

import javax.swing.*;

public class C05_Actions extends Testbase {

    @Test
    public void test01(){
        //2- https://the-internet.herokuapp.com/context_menu sitesine gidin
driver.get("https://the-internet.herokuapp.com/context_menu");
        //3- Cizili alan uzerinde sag click yapin
        Actions actions=new Actions(driver);
        WebElement cizilialanElementi= driver.findElement(By.linkText("hot-spot"));
        actions.contextClick(cizilialanElementi);


        //4- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
        //5- Tamam diyerek alert’i kapatalim
        //6- Elemental Selenium linkine tiklayalim
        //7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test et


    }

}
