package com.shashankkumar.ex12ActionAdvanced;

import io.qameta.allure.Description;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium030ActionsScroling {

    @Description("To verify Scrolling")
    @Test
    public void testSeleniumScrolling(){
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://thetestingacademy.com/");

        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
