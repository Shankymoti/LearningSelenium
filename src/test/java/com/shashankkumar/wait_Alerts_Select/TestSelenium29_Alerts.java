package com.shashankkumar.wait_Alerts_Select;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium29_Alerts {

    @Test
    public void test_SelniumAlets() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        //Alert with Okay Button
       /* WebElement element = driver.findElement(By.xpath("//*[@onclick='jsAlert()']"));
        element.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"I am a JS Alert");
        alert.accept();
        Assert.assertEquals(driver.findElement(By.cssSelector("#result")).getText(), "You successfully clicked an alert");

        */

        //or
        // driver.switchTo().alert().accept();
        // Alert with ok and cancel button

      //  WebElement element2 = driver.findElement(By.xpath("//*[@onclick='jsConfirm()']"));
       // element2.click();
        //1st

     /*   driver.switchTo().alert().accept();
        Assert.assertEquals(driver.findElement(By.cssSelector("#result")).getText(), "You clicked: Ok");

      */

   /*     driver.switchTo().alert().dismiss();
       Assert.assertEquals(driver.findElement(By.cssSelector("#result")).getText(), "You clicked: Cancel");

    */

     //   WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(3));
       // wait2.until(ExpectedConditions.alertIsPresent());

     //   Alert alert = driver.switchTo().alert();
      /*  alert.accept();
        Assert.assertEquals(driver.findElement(By.cssSelector("#result")).getText(), "You clicked: Ok");

       */
    /*  String msg =   alert.getText();
      Assert.assertEquals(msg,"I am a JS Confirm");
       alert.dismiss();
        Assert.assertEquals(driver.findElement(By.cssSelector("#result")).getText(), "You clicked: Cancel");
        */


        //3.Alert window with inpput box, capture text from alert

       /* WebElement element3 = driver.findElement(By.xpath("//*[@onclick='jsPrompt()']"));
        element3.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String msg = alert.getText();

        Assert.assertEquals(msg, "I am a JS prompt");

        */

      /*  alert.sendKeys("ShashankTesting");
        alert.accept();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: ShashankTesting");


       */


       /* alert.dismiss();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(),"You entered: null");


        */

        // Handle basic  auth
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}