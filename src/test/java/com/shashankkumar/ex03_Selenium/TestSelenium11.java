package com.shashankkumar.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium11 {

    @Description("")
    @Test
    public void testSelenium11(){
        WebDriver driver = new FirefoxDriver();
        driver = new ChromeDriver();

        FirefoxDriver driver1 = new FirefoxDriver();
       // driver1 = new ChromeDriver();


    }
}
