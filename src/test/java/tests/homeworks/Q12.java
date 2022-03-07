package tests.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Q12 {
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
        //    https://www.chanel.com/us/
        driver.get("https://www.chanel.com/us/");
//            1st test:


//            1- Accessing the site --> OK if the site is displayed



//    2- Click on the search bar (on the top menu)
        driver.findElement(By.xpath("(//button[@title='Search'])[2]")).click();
//    3- Search for "ROUGE ALLURE"

//            3- Check if the items of the displayed list contain the searched word
//    4- Select the second item of the list
//    5- Make sure that the displayed product name is the same as the previously selected name.
    }

@Test
    public void test02(){
    //2nd test:
//            1- Access to the site
//    2- Access to Makeup => Lipstick category (on top menu)
//    3- Click on ROUGE ALLURE product
//    4- Add the product to the cart
//    5- View Cart --> OK, if there is a "ROUGE ALLURE" product in the cart, the quantity=1 and the total cart is equal to the product price.
}




}
