package tests.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;

public class interview_sorusu02  {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


   @Test
    public void test01(){
       // 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
   driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
// 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
// (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )

       WebElement urunler=driver.findElement(By.xpath("//small[@class='products-found']"));
       Select urunlerSelect=new Select(urunler);
       List<WebElement> urunlerList=urunlerSelect.getOptions();

       for (WebElement each:urunlerList) {
           System.out.println(each.getText()+" ");

       }

// 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
// 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın
// (Her ürün 1 defadan fazla eklenemez!)
// 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın
// 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin
// 7.Checkout'a tıklayın
   }

}
