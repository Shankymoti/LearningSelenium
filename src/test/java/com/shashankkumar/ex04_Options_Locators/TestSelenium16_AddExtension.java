package com.shashankkumar.ex04_Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16_AddExtension {
    @Description("")
    @Test
    public void test_Selenium15() throws InterruptedException {
       // EdgeOptions ChromeOptions, FirefoxOptions, SafariOptions
        ChromeOptions chromeOptions = new ChromeOptions();

       chromeOptions.addArguments("--window-size=1920,1080");// Full hd
        chromeOptions.addExtensions(new File("src/test/java/com/shashankkumar/adBlocker.crx"));
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");



        Thread.sleep(35000);
        driver.quit();
    }
}
