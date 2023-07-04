package tests.day10_wait_cookies;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import tests.utilities.Testbase;

import java.util.Set;

public class C02_Cookies extends Testbase {

    @Test
    public void test01(){

        //1- Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //2- tum cookie’leri listeleyin

        Set<Cookie>cookiesSeti =driver.manage().getCookies();

        int sırano=1;
        for (Cookie eachCooki: cookiesSeti
             ) {
            System.out.println(sırano +"  - " +eachCooki);
            sırano++;

        }
        //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        Assert.assertTrue(cookiesSeti.size()>5);
        //4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
      String actualyCoki= driver.manage().getCookieNamed("i18n-prefs").getValue();
      String expectedCoki = "USD";
      Assert.assertEquals(expectedCoki,actualyCoki);
        //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin

Cookie cookie =new Cookie("en sevdigim cookie","cikolatali");
driver.manage().addCookie(cookie);
        //6- eklediginiz cookie’nin sayfaya eklendigini test edin
        actualyCoki = driver.manage().getCookieNamed("en sevdigim cookie").getValue();

        }





        //7- ismi skin olan cookie’yi silin ve silindigini test edin
       //String actualy= driver.manage().deleteCookieNamed("skin");
        //8- tum cookie’leri silin ve silindigini test edin



    }


