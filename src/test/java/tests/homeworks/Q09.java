package tests.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Q09 {

    //   1- https://www.facebook.com adresine gidelim
    //    2- Yeni hesap olustur butonuna basalim
    //    3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test01(){
        //   1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        //    2- Yeni hesap olustur butonuna basalim
  driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        //    3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        Actions actions=new Actions(driver);
        WebElement isim= driver.findElement(By.xpath("//input[@name='firstname']"));
        actions.click(isim).
            sendKeys("fadime").
                sendKeys(Keys.TAB).
                sendKeys("ILHAN").
                sendKeys(Keys.TAB).
                sendKeys("fadimevurmazilhan@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys("tahsinilhan").
                perform();



    }
}
