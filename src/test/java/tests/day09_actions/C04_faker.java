package tests.day09_actions;

import com.github.javafaker.Faker;
import org.junit.Test;
import tests.utilities.Testbase;

public class C04_faker extends Testbase {


    @Test
    public void test01(){

         /*
            Faker kutuphanesi, testlerimizi yazarken ihtiyac duyabilecegimiz
            isim, soyisim, email, password, username... gibi
            bilgileri fake olarak kullanabilmemizi saglar
         */
        Faker faker =new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.internet().password());
        faker.internet().emailAddress();
        System.out.println(faker.internet().avatar());
    }
}
