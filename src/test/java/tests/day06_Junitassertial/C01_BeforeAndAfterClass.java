package tests.day06_Junitassertial;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_BeforeAndAfterClass {
    static WebDriver driver;
    //amazon sayfaya gidin
    //3 farklı  test  metodu oluşturup verilen testleri yapın
    //1
    @BeforeClass
    public static  void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterClass
    public static void teardown(){
        driver.close();
    }

    @Test
    public void test01(){
        driver.get("https://www.amazon.com");

        String  expectedUrl="amazon.com";
        String actualUrl =driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Amazon Url testi passed");
        }else {
            System.out.println("Amazon Url testi failed"+actualUrl);
            throw new RuntimeException();

        }
    }
    @Test
    public void test02(){
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        WebElement  sonucYazıElementi = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String expectedİcerik  ="nutella";
        String actualicerik =sonucYazıElementi.getText();

        if (actualicerik.contains(expectedİcerik)){

            System.out.println("yazı testi  passed");
        }else {
            System.out.println("yazı testi failed");
            throw new RuntimeException();
        }
    }
    @Test
    public  void test03(){

        driver.findElement(By.xpath("(//*[@class='s-image'])[1]"));

      WebElement urunisimElement = driver.findElement(By.xpath("//span[@id='productTitle']"));
         String expectediçeril ="Nutella";
         String actualiçerik = urunisimElement.getText();

         if (actualiçerik.contains(expectediçeril)){
             System.out.println("ürün isin testi passed");
         }else {
             System.out.println("ürün isin testi failed");
             throw new RuntimeException();
         }

    }


    }


