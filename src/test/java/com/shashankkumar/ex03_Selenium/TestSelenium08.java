package com.shashankkumar.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium08 {

    @Description("")
    @Test
    public void testSelenium08(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
    }
}
