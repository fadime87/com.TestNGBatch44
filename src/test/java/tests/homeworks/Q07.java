package tests.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Q07 {
    // 4 TEST METODU OLUSTURUN,oncelik vererek sirasiyla
    // https://www.n11.com/ SAYFASINA GiDİN.
    // https://www.gittigidiyor.com/ SAYFASINA GiDiN
    // https://getir.com/ SAYFASINA GiDiN
    // https://www.sahibinden.com/ SAYFASINA GiDiN
WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test(priority = 1 )
    public void test1() throws InterruptedException {
        https://www.n11.com/ SAYFASINA GiDİN.
        driver.get("//www.n11.com/");
        Thread.sleep(3000);
    }
    @Test(priority = 2 )
    public void test2() throws InterruptedException {
        // https://www.gittigidiyor.com/ SAYFASINA GiDiN
        driver.get("//www.gittigidiyor.com/ ");
        Thread.sleep(3000);
    }

    @Test(priority = 3 )
    public void test3() throws InterruptedException {
        // https://getir.com/ SAYFASINA GiDiN
        driver.get("https://getir.com/");
        Thread.sleep(3000);
    }
    @Test(priority = 4 )
    public void test4() throws InterruptedException {
        // https://www.sahibinden.com/ SAYFASINA GiDiN
        driver.get("https://www.sahibinden.com/");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }


}
