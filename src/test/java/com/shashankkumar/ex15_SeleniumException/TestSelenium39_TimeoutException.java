package com.shashankkumar.ex15_SeleniumException;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium39_TimeoutException {
    WebDriver driver;
    @BeforeTest
    public void startBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--guest");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }
    @Owner("Shashank")
    @Description("Verifying TimeoutException")
    @Test
    public void testSeleniumStaleElementReferenceException(){
        driver.get("https://google.com");

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));

        try{

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));

            WebElement search_inputbox = driver.findElement(By.id("APjFqb"));


            search_inputbox.sendKeys("thetestingacademy"+ Keys.ENTER);

        }catch (TimeoutException e){
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
