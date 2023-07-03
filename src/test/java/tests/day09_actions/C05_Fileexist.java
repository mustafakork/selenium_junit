package tests.day09_actions;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C05_Fileexist {

    @Test

    public void test01(){
        //C:\Users\a\Downloads\avatar.png
        Assert.assertTrue(Files.exists(Paths.get("C:\\Users\\a\\Downloads")));


    }

    @Test

    public void dinamikTest(){
//1-çalıştığımızı klasorün dosya yolunu alamka isterseniz
        System.out.println(System.getProperty("user.dir"));
        //C:\Users\a\IdeaProjects\team116_junit


        //2-bilgisayarımızın ana dosya yolu
        System.out.println(System.getProperty("user.home"));
        //C:\Users\a

        String dinamikDosyaYolu= System.getProperty("user.home") + "\\Downloads\\avatar.png";
        System.out.println(dinamikDosyaYolu);
        //C:\Users\a\Downloads\avatar.png

    }


}
