package com.shashankkumar.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium13 {

    @Description("")
    @Test
    public void testSelenium(){
        WebDriver driver = new FirefoxDriver();
       // driver.get("google.com");
        driver.get("https:google.com");

    }
}
