package tests.mySeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import tests.utilities.Testbase;

import java.time.Duration;

public class P03_action  {

    @Test
    public void test01(){
        //1- launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2.navigate to url https://www.automationexercise.com/
        driver.get("https://www.automationexercise.com/");
        //3- Clic "sign up" button
        WebElement signupElementi= driver.findElement(By.xpath("//a[@href='/login']"));
        //1. çözüm "signupElementi.click();"
        //2. çözüm actions ile
        Actions actions=new Actions(driver);
        actions.click(signupElementi).perform();
        // 4-Enter name and email address
        WebElement nameTuşElementi = driver.findElement(By.name("name"));
       actions.click(nameTuşElementi)
               .sendKeys("mustafa")
               .sendKeys(Keys.TAB)
               .sendKeys("b111512@gmail.com")
               .sendKeys(Keys.ENTER).perform();


        //fill details first name last name company, adress1
        //fill  details title, name, pasword, dataof birth
        WebElement titlElementi=driver.findElement(By.xpath("//input[@type='radio'][1]"));
        actions.click(titlElementi)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys("20")
                .sendKeys(Keys.TAB)
                .sendKeys("July")
                .sendKeys(Keys.TAB)
                .sendKeys("1980").perform();
                /*.sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB);

                 */

        //select check box
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        //select check box



        actions.click(driver.findElement(By.name("first_name")))

                .sendKeys("muko")
                .sendKeys(Keys.TAB)
                .sendKeys("kork")
                .sendKeys(Keys.TAB)
                .sendKeys("wise")
                .sendKeys(Keys.TAB)
                .sendKeys("Teksas")
                .sendKeys(Keys.TAB)
                .sendKeys("tokat")
                .sendKeys(Keys.TAB)
                .sendKeys("canada")
                .sendKeys(Keys.TAB)
                .sendKeys("USA")
                .sendKeys(Keys.TAB)
                .sendKeys("almus")
                .sendKeys(Keys.TAB)
                .sendKeys("mkmfd")
                .sendKeys(Keys.TAB)
                .sendKeys("02511511")
                .sendKeys(Keys.TAB)
        //10- Click "create account button
            .sendKeys(Keys.ENTER).perform();
        //11-Verfy that 'ACCOUNT CREATED!' is visible

        String expectedYazı = "ACCOUNT CREATED!";
        String actualyYazı= driver.findElement(By.xpath("//*[text()='Account Created!']")).getText();

        Assert.assertEquals(expectedYazı,actualyYazı);





    }
}
