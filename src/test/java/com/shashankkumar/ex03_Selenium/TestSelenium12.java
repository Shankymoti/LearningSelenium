package com.shashankkumar.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium12 {

    @Description("")
    @Test
    public void testSelenium12(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        //Use Navigation method
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
