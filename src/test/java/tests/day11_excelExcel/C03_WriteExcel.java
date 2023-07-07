package tests.day11_excelExcel;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03_WriteExcel {

    @Test
     public  void test01() throws IOException {
        String dosyayolu ="src/test/java/tests/day11_excelExcel/ulkeler.xlsx";
        FileInputStream fis =new FileInputStream(dosyayolu);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sayfa1 =workbook.getSheet("sayfa1");
        //4. hücreye yeni cell oluşturalım
        sayfa1.getRow(0).createCell(4);
        // oluşturduğumuz hücreye "nufus" ekleyeliö
        sayfa1.getRow(0).getCell(4).setCellValue("nufus");

        //2.satır nufus bilgigisine 150000 yazdıralım

        sayfa1.getRow(2).createCell(4).setCellValue(150000);
        //10.satır nufus bilgigisine 2000000 yazdıralım

        sayfa1.getRow(10).createCell(4).setCellValue(200000);
        //15.satır nufus bilgigisine 350000 yazdıralım
        sayfa1.getRow(15).createCell(4).setCellValue(350000);
        //dosyayı kaydelim
        FileOutputStream fos =new FileOutputStream(dosyayolu);
        workbook.write(fos);
        //dosyayı kapatalım
        fis.close();
        fos.close();
        workbook.close();




    }




}
