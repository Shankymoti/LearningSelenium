package com.shashankkumar.ex05_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task30Dec {

    /*
    https://katalon-demo-cura.herokuapp.com/

Click on Make Appointment button

Enter the Login creds and submit click

Verify the current URL == https://katalon-demo-cura.herokuapp.com/#appointment


     */
    @Owner("Shashank")
    @Description("30 December Task")
    @Test
    public void test_Task30Dec2024() throws InterruptedException {
        ChromeOptions chromeOptions =  new ChromeOptions();
        chromeOptions.addArguments("--window-maximize");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement makeAppointBtn = driver.findElement(By.linkText("Make Appointment"));
        makeAppointBtn.click();


        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement loginBtn =  driver.findElement(By.id("btn-login"));
        loginBtn.click();
        Thread.sleep(2000);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://katalon-demo-cura.herokuapp.com/#appointment");


       Thread.sleep(5000);
       driver.quit();

    }
}
