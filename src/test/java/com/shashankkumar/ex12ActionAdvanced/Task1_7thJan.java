package com.shashankkumar.ex12ActionAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1_7thJan {

    WebDriver driver;
    @BeforeTest
    public void startBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testTaskFileUpload(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement fileUploadElement =  driver.findElement(By.id("file-upload"));
        fileUploadElement.sendKeys(System.getProperty("user.dir")+ "/src/test/java/com/shashankkumar/ex12ActionAdvanced/TestData.txt");
        driver.findElement(By.id("file-submit")).click();

        Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(),"File Uploaded!");
    }
    @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
