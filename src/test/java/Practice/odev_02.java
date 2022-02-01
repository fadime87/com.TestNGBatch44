package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class odev_02 {
    WebDriver driver;
    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

  //2.soru:Turkce
    // url'ye gidin :http://demo.automationtesting.in/Alerts.html
    // "Alert with OK"yi tıklayın ve 'click the button to display a confirm box' i tıklayın:'
    // Uyarıyı kabul et(I am an alert box!) ve uyarıyı konsolda yazdır
    //  "Alert with OK & Cancel" ı tıklayın ve 'click the button to display a confirm box' i tıklayın
    // Uyarıyı iptal et (Press a Button !)
    // "Alert with Textbox" ı tıklayın ve 'click the button to demonstrate the prompt box' tıklayın'
    // ve ardından sendKeys 'TechProEducation' (Lütfen adınızı girin)
    // sonunda "Hello TechproEducation How are you today" mesajını konsola yazdır (edited)
@Test
    public void odev02Allert(){
    //    go to url :http://demo.automationtesting.in/Alerts.html
    driver.get("http://demo.automationtesting.in/Alerts.html");
    //    click  "Alert with OK" and click 'click the button to display an alert box:'
    driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

  //    accept Alert(I am an alert box!) and print alert on console
    System.out.println(driver.switchTo().alert().getText());
    driver.switchTo().alert().accept();

    //    click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
    driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

    //    cancel Alert  (Press a Button !)
    driver.switchTo().alert().dismiss();

    //    click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
    driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
    //    and then sendKeys 'TechProEducation' (Please enter your name)
    driver.switchTo().alert().sendKeys("TechProEducation");
    driver.switchTo().alert().accept();

    //    finally print on console this message "Hello TechproEducation How are you today"
   String mesaj= driver.findElement(By.xpath("//p[@id='demo1']")).getText();

    System.out.println(mesaj);
}
}
