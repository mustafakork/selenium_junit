package tests.day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_BoniagarciarWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com ");

        //2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
        //3. Login alanine  “username” yazdirin
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        //4. Password alanina “password” yazdirin
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        //5. Sign in buttonuna tiklayin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        //6. Back tusu ile sayfaya donun
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);
        //7. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//li[@id='onlineBankingMenu']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();


//8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.xpath("//input[@id='sp_amount']")).sendKeys("25");

//9. tarih kismina “2020-09-10” yazdirin

        driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2020-09-10");
//10. Pay buttonuna tiklayin
        driver.findElement(By.xpath("//input[@id='pay_saved_payees']")).click();

/*1. “The payment was successfully submitted.” mesajinin ciktigini test edin
 */

        WebElement ödemeYazısı = driver.findElement(By.xpath("//div[@id='alert_content']"));
    String  expectedmesaj="The payment was successfully submitted.";
    String actualmesaj = ödemeYazısı.getText();

    if (actualmesaj.equals(expectedmesaj)){
        System.out.println("test passed");
    }else {
        System.out.println("test failed");
    }

    }
}
