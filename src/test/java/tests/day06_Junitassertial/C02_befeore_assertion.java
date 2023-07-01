package tests.day06_Junitassertial;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_befeore_assertion {
    //2) https://www.bestbuy.com/ Adresine gidin
    //   farkli test method’lari olusturarak asagidaki testleri yapin
    //       ○Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    //      ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    //      ○ logoTest => BestBuy logosunun görüntülendigini test edin
    //      ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin

    static WebDriver driver;

    @BeforeClass
    public static void setup(){
    WebDriverManager.chromedriver().setup();
    driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.bestbuy.com/");
    }
    @AfterClass
    public static void teardown(){

        //driver.close();
    }
    @Test
    // ○Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    public void urlTest(){
String expectedUrlIçerik ="https://www.bestbuy.com/ ";
String actualUrlIçerik = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrlIçerik,actualUrlIçerik);
/*if (expectedUrlIçerik.equals(actualUrlIçerik)){
    System.out.println("Url TESTİ passed");
}else {
    System.out.println("URL Testi failed ");
}

 */


    }
    @Test
    //○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    public void titleTest(){

        String expectedTitle = "Rest";
        String actualTitle =driver.getTitle();
        Assert.assertFalse(actualTitle.contains(expectedTitle));



    }
    //      ○ logoTest => BestBuy logosunun görüntülendigini test edin
    @Test
    public void logoTesti(){
        WebElement logoElementi =driver.findElement(By.xpath("(//img[@class='logo'])[1]"));

        Assert.assertTrue( logoElementi.isDisplayed());

    }
    //○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin

    @Test
    public void francaTesti(){

        WebElement  francaLinki = driver.findElement(By.xpath("//button[@lang='fr']"));
    }
}
