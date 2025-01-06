package com.shashankkumar.ex09waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium26 {

    // Locators - Find the Web elements
    // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
    //Find the Email id** and enter the email as admin@admin.com
    //Find the pass inputbox** and enter passwrod as admin.
    //Find and Click on the submit button
    //Verify that the error message is shown "Your email, password, IP address or location did not match"

    WebDriver driver;
   // WebDriverWait wait;
    @BeforeTest
    public void browserSetup(){
        driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Owner("Shashank")
    @Description("Explict wait ")
    @Test
public void testSeleniumwWait(){
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("shashank.k@testingacademy.com");
        driver.findElement(By.name("password")).sendKeys("Pass@123");
        //Explict wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-qa='sibequkica']")));
        driver.findElement(By.xpath("//*[@data-qa='sibequkica']")).click();

        //Fluent wait

        WebElement error_message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));
        //or
       // Wait<WebDriver>

        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");
    }

@AfterTest
public void closeBrowser(){

        driver.quit();
}
}
