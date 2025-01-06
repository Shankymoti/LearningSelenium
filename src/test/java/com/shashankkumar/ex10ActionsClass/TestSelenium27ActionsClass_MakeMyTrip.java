package com.shashankkumar.ex10ActionsClass;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium27ActionsClass_MakeMyTrip {
    WebDriver driver;

    @BeforeTest
   public void setup(){
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       String url = "https://www.makemytrip.com/";
       driver.navigate().to(url);
   }

   @Test
   public void testSelenium27ActionsClass(){
       WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(3));
       WebElement pop =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("commonModal__close")));
       pop.click();
       WebElement fromCity = driver.findElement(By.id("fromCity"));

       Actions actions = new Actions(driver);

       actions.moveToElement(fromCity).click().sendKeys("del").build().perform();;
       actions.moveToElement(fromCity).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();

       driver.quit();
    }
}
