package tests.day09_actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import tests.utilities.Testbase;

public class C02_Keybords extends Testbase {



    //4- aramanin gerceklestigini test edin
    @Test
    public void test01(){
//2- https://www.amazon.com sayfasina gidelim

    driver.get("https://www.amazon.com");

 //3- Arama kutusuna actions method’larini kullanarak Samsung A71
        // yazdirin ve Enter’a basarak arama yaptirin
        WebElement  aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions =new Actions(driver);
        actions.click(aramakutusu)
                .keyDown(Keys.SHIFT)
                .sendKeys("s")
                .keyUp(Keys.SHIFT)
                .sendKeys("amsung")
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("71")
                .sendKeys(Keys.ENTER)
                .perform();
    }

}
