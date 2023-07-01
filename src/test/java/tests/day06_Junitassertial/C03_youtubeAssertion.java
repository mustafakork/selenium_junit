package tests.day06_Junitassertial;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_youtubeAssertion {
        //2) https://www.youtube.com adresine gidin
            //3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
         //○ titleTest  => Sayfa başlığının “YouTube” oldugunu test edin
    // ○ imageTest  => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    //○ Search Box ’in erisilebilir oldugunu test edin (isEnabled())
            //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
    static WebDriver driver;
    @BeforeClass
    public  static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(" https://www.youtube.com");
    }
    //○ titleTest  => Sayfa başlığının “YouTube” oldugunu test edin
    @Test
    public void titleTest(){
        //  ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
        String expectedTitle = "YouTube";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    // ○ imageTest  => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    @Test
    public void imagetesti(){
        WebElement youtubeLogoelementi =driver.findElement(By.xpath(""));




    }
    @Test
    public void titletesti(){




    }
    @AfterClass
    public static void teardawn(){


    }



}
