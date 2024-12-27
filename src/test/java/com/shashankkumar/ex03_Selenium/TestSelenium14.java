package com.shashankkumar.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium14 {
@Description(" ")
    @Test
    public void testSelenium14() throws InterruptedException {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://google.com");


    Thread.sleep(3000);
    //driver.close(); it will close current tab and not the session and session != null


    driver.quit();
    // it will close all tab and session = null





}
}
