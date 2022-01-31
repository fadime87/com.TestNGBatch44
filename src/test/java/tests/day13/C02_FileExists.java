package tests.day13;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C02_FileExists {
    @Test
    public void test01(){
        System.out.println( System.getProperty("user.home"));

        //masaustundeki deneme klasorunun path ini istesem
       // C:\Users\admin\Desktop\deneme
        String path=System.getProperty("user.home")+"\\Desktop\\deneme";
        System.out.println(path);
        System.out.println("user.dir.:"+System.getProperty("user.dir"));
        //masa ustunde deneme klasoru icerisinde selenium.xlsx bir dosya oldugunu test edin
        //once bu dostata ulasmak icin gereli dinamik path olusturulmali
        String dosyayolu=System.getProperty("user.home")+"\\Desktop\\deneme\\selenium.xlsx";
        System.out.println(Files.exists(Paths.get("dosyayolu")));
        //projemizde pom.xml oldugunu test edin

       // System.out.println(C:\Users\admin\eclipse-workspace\com.TestNGBacth44\pom.xml);
        System.out.println(System.getProperty("user.dir"));
        String pomPath=System.getProperty("user.dir")+ "\\pom.xml";

        Assert.assertTrue(Files.exists(Paths.get(pomPath)));
    }
}
