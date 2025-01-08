package com.shashankkumar.ex13JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium32JS {

    WebDriver driver;
    @BeforeTest
    public void startBrowser(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    }

    @Test
    public void testSelenuimJS(){
        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement scrollToElement =  driver.findElement(By.xpath("//div[@id='userName']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("arguments[0].scrollIntoView(true)",scrollToElement);
        js.executeScript("window.scrollTo(0,1000)");
    }

    public void closeBrowser(){
        try{
            Thread.sleep(3000);

        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}
