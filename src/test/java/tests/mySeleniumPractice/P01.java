package tests.mySeleniumPractice;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.utilities.Testbase;

public class P01 extends Testbase {

    @Test
    public void test01(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get(" http://automationexercise.com");
        //3. Verify that home page is visible successfully

        WebElement homepageElementi = driver.findElement(By.xpath("//a[@style='color: orange;']"));

        Assert.assertTrue(homepageElementi.isDisplayed());
        //4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//*[text()=' Contact us']")).click();
        System.out.println(driver.findElement(By.xpath("//*[text()=' Contact us']")).getText());
        //5. Verify 'GET IN TOUCH' is visible
        WebElement getTouchElementi = driver.findElement(By.xpath("//h2[text()='Get In Touch']"));
        Assert.assertTrue(getTouchElementi.isDisplayed());
        //6. Enter name, email, subject and message
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("muko");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("muko@hhh");
        driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("mukolar");
        driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("mukolar");
        //7. Upload file
        driver.findElement(By.xpath("//input[@name='upload_file']")).isSelected();
        //8. Click 'Submit' button
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        //9. Click OK button
        driver.switchTo().alert().accept();
        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        WebElement successmesajElenti= driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
        Assert.assertTrue(successmesajElenti.isDisplayed());
        //11. Click 'Home' button and verify that landed to home page successfully
        WebElement hometuşu =driver.findElement(By.xpath("//a[@class='btn btn-success']"));
        hometuşu.click();

        String expectedhomeUrl="http://automationexercise.com";
        String actualhome =driver.getCurrentUrl();

        String expectedUrl = "https://automationexercise.com/contact_us#google_vignette";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(expectedUrl,actualUrl);



    }

}
