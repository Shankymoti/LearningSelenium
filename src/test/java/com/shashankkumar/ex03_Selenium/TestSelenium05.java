package com.shashankkumar.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium05 {

    @Description("")
    @Test
    public void testSelenium05(){

        WebDriver driver =  new FirefoxDriver();
        driver.get("https://app.vwo.com");
    }
}
