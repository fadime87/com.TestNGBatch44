package tests.homeworks;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class Q11 extends TestBase {

    @Test
    public void Q11_HomeworkTest() {
        //
        //      go to url :http://demo.guru99.com/popup.php
        driver.get("http://demo.guru99.com/popup.php");
        //      get the first window
        String ilkPencereHandle = driver.getWindowHandle();
        //      clicking on click here button
        WebElement clickButon = driver.findElement(By.cssSelector("[style=\"font-size:16px;\"]"));
        clickButon.click();
        //      get all the window in the set
        Set<String> windoHandles = driver.getWindowHandles();
        String ikinciPencereHandle = "";
        for (String each : windoHandles) {
            if (!each.equals(ilkPencereHandle)) {
                ikinciPencereHandle = each;
            }
        }
        //      switch to window
        driver.switchTo().window(ikinciPencereHandle);
        //      input email id (somepne@gmail.com) and type something in that input
        WebElement emailIdElement = driver.findElement(By.cssSelector("[name=\"emailid\"]"));
        Actions actions = new Actions(driver);
        actions.click(emailIdElement).sendKeys("omepne@gmail.com").
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        //      Clicking on the submit button
        //      verify title as expected
        Assert.assertTrue(driver.findElement(By.xpath("(//td[@colspan='2'])[1]")).isDisplayed());
        //      switch to first window
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        driver.switchTo().window(ilkPencereHandle);
        System.out.println("ilk pencere url'si:  " + driver.getCurrentUrl());
        //
    }
}
