package tests.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReusableMethod {
    public  static  void  tümsayfaFotoçek(WebDriver driver){

        TakesScreenshot tss = (TakesScreenshot) driver;
//dosya adını dinamik hale getirrmek için time stamp kullanalım

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYddhhmm");
        String dinamikDosyaYolu = "target/ScreenS/Tümsayfa"+ldt.format(dtf)+"png";

        File tümSayfaFoto =new File(dinamikDosyaYolu);
        File geçici=tss.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(geçici,tümSayfaFoto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }}
