package Practice;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class odev_01   {

    WebDriver driver;
    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
//1.soru :Turkce
//web sitesine gidin: https://www.jqueryscript.net/demo/bootstrap-alert-box/
//     pencereyi büyüt
   //  eylem diyalog düğmesine tıklayın
    // kullanmanız gerekiyorsa açıkça bekleyin
    // tamam butonuna tıklayın
    // iframe mesajını kabul et



    @Test
    public void iframeTest() throws InterruptedException {
        //go to web site : https://www.jqueryscript.net/demo/bootstrap-alert-box/

        driver.get("https://www.jqueryscript.net/demo/bootstrap-alert-box/");

        //maximize the window
        driver.manage().window().maximize();
       //click on action dialog button
      WebElement actionButon = driver.findElement(By.xpath("//button [@class='btn btn-warning']"));
      actionButon.click();
        //if need use explicitly wait
        Thread.sleep(1000);
     //click on the ok button
        driver.findElement(By.xpath("//button[@class='btn btn-info btn-sm']")).click();
      //accept the iframe message

        driver.switchTo().alert().accept();
    }
    @AfterClass
    public void teardown() {
        driver.close();

    }

}
