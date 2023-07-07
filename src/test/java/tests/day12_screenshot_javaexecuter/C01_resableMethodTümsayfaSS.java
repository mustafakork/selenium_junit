package tests.day12_screenshot_javaexecuter;

import org.junit.Assert;
import org.junit.Test;
import tests.utilities.ReusableMethod;
import tests.utilities.Testbase;

public class C01_resableMethodTümsayfaSS extends Testbase {

    @Test
    public  void test01(){
        // wisequarter ana sayfasına gidin

        driver.get("https://www.wisequarter.com");
        //urlnin wise içerdiğini test edin
        String expectedUrl = "wise";
        String actualUrl= driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrl));


        //tüm sayfa screen shot alın
        ReusableMethod.tümsayfaFotoçek(driver);
        //2023-07-07T16:43:45.265672100
    }


}
