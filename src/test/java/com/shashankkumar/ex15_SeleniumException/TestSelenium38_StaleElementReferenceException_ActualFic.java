package com.shashankkumar.ex15_SeleniumException;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium38_StaleElementReferenceException_ActualFic {

    WebDriver driver;
    @BeforeTest
    public void startBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--guest");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }
    @Owner("Shashank")
    @Description("fix of NoSuchElementException")
    @Test
    public void testSeleniumStaleElementReferenceException(){
        driver.get("https://google.com");

//        WebElement search_inputbox = driver.findElement(By.id("APjFqb"));
//        driver.navigate().refresh();
//
//        search_inputbox.sendKeys("thetestingacademy"+ Keys.ENTER);
        try{
            WebElement search_inputbox = driver.findElement(By.id("APjFqb"));
            driver.navigate().refresh();
            // HTML Page (DOM) is not refreshed,
            // Driver will think that, element may or may not available now.
            // I have found the element before refresh.

            // Refresh, Navigate other Page, change in DOM elements (Ajax Calls) - VueJS, AngularJS

            // If you want to fix the stale element exp - refind the element after DOM changes)
            search_inputbox  = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

            search_inputbox.sendKeys("thetestingacademy"+ Keys.ENTER);

        }catch (StaleElementReferenceException e){
            System.out.println(e.getMessage());
        }

        System.out.println("End of Program");

    }

    @AfterTest
    public void stopBrowser(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
