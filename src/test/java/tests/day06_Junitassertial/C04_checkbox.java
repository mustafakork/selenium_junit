package tests.day06_Junitassertial;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_checkbox {

    /*
    a. Verilen web sayfasına gidin.
     https://the-internet.herokuapp.com/checkboxes

     */

   WebDriver driver;

  @Before

    public  void setup(){
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        }
        @After
    public void teardown(){


        }
        @Test
    public void checkboxTesti(){
      driver.get("https://the-internet.herokuapp.com/checkboxes");

            //b. Checkbox1 ve checkbox2 elementlerini locate edin.

            WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
            WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
            // c. Checkbox1 seçili değilse onay kutusunu tıklayın
            if (!checkbox1.isSelected()){
                checkbox1.click();
            }
            // d. Checkbox2 seçili değilse onay kutusunu tıklayın
            if (!checkbox2.isSelected()){
                checkbox2.click();
            }
            // e. Checkbox1ve Checkbox2’nin seçili olduğunu test edin

            Assert.assertTrue(checkbox1.isSelected());
            Assert.assertTrue(checkbox2.isSelected());




        }



}

