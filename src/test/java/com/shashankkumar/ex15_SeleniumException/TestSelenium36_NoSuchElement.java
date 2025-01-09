package com.shashankkumar.ex15_SeleniumException;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium36_NoSuchElement {

    WebDriver driver;
    @BeforeTest
    public void startBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--guest");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }
    @Owner("Shashank")
    @Description("Verifying NoSuchElementException")
    @Test
    public void testSeleniumNoSuchElement(){
        driver.get("https://google.com");
       // driver.findElement(By.id("shashank"));
        try{
            driver.findElement(By.id("shashank"));

        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }

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
