package tests.day09_actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import tests.utilities.Testbase;

public class C01_actionMoveToElement extends Testbase {



    @Test
    public void test01(){

        //1- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin
        // mouse’u bu menunun ustune getirin
        Actions actions =new Actions(driver);
        WebElement accountListElementi = driver.findElement(By.id("nav-link-accountList"));
        bekle(5);
        actions.moveToElement(accountListElementi).perform();
        bekle(5);

        //3- “Create a list” butonuna basin

        WebElement creatListElement = driver.findElement(By.xpath("//span[text()='Create a List']"));
        actions.click(creatListElement).perform();
        //4- Acilan sayfada “Your Lists” yazisi oldugunu test edin



    }
}
