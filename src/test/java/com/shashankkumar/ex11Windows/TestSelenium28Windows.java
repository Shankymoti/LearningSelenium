package com.shashankkumar.ex11Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;
public class TestSelenium28Windows {

    @Test
    public void test_Selenium28(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/windows");

        String parentWindowID = driver.getWindowHandle();
        System.out.println(parentWindowID);

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowsIds =  driver.getWindowHandles();
        System.out.println(windowsIds);

        for(String wid : windowsIds){
            System.out.println(wid);
            driver.switchTo().window(wid);
            if (driver.getPageSource().contains("New Window")){
                Assert.assertTrue(true);
            }
        }
        driver.quit();
    }


}
