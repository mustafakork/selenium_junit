package tests.day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Before_AfterTest {

    WebDriver driver;

    @Test
    public void amazonTesti() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        String expectedUrlIcerek = "amazon";
        String actualurlıcerik = driver.getCurrentUrl();

        if (actualurlıcerik.contains(expectedUrlIcerek)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
driver.close();
    }

    @Test
    public void wiswquartertesti() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.wisequarter.com");

        String expectedTitle = "Wise Quarters";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("wise testi passed");
        } else {
            System.out.println("wise testi failed");
        }
        driver.close();
    }

    @Test
    public  void youTubeTesti(){
        //youtube anasayfasına gidin
        setup();
        driver.get("https://www.youtube.com");

        // Title youtube olduğunu göründüğünü test edin

        String expectedTitle="YouTube";
        String actualTitle =driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("youtube testi passed");
        }else {
            System.out.println("youtube testi failed");
        }
        driver.close();
        }
@Test
public void setup1(){


}
        public  void setup(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       }


        }

