package com.shashankkumar.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium09 {

    @Description("open url")
    @Test
    public void testSelenium09(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        Assert.assertEquals(driver.getTitle(), "Google");
    }
}
