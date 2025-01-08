package com.shashankkumar.ex12ActionAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium029FileUpload {
    WebDriver driver;
    @BeforeTest
    public void startBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver =  new ChromeDriver(chromeOptions);

    }

    @Test
    public void testSeleniumFileUpload(){
        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement fileToUpload =  driver.findElement(By.id("fileToUpload"));
        String working_directory =  System.getProperty("user.dir");
        System.out.println(working_directory);

        fileToUpload.sendKeys(working_directory + "/src/test/java/com/shashankkumar/ex12ActionAdvanced/TestData.txt");

        driver.findElement(By.name("submit"));

    }

    @AfterTest
    public void closeBrowser(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}
