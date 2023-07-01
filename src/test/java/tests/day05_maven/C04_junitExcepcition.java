package tests.day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_junitExcepcition {

    @Test
    public  void amzonTesti(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        String expectedUrlIcerek ="ramazon";
        String  actualurlıcerik = driver.getCurrentUrl();

        if (actualurlıcerik.contains(expectedUrlIcerek)){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
            throw new RuntimeException();
        }

    }
    @Test
    public void wiswquartertesti(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.wisequarter.com");

        String expectedTitle = "Wise Quarter";
        String  actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("wise testi passed");
        }else {
            System.out.println("wise testi failed");
            throw new RuntimeException();
        }
        driver.close();
}}
