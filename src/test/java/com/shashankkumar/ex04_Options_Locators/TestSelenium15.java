package com.shashankkumar.ex04_Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium15 {
    @Description("")
    @Test
    public void test_Selenium15() throws InterruptedException {
       // EdgeOptions ChromeOptions, FirefoxOptions, SafariOptions
        ChromeOptions chromeOptions = new ChromeOptions();
        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?

       //chromeOptions.addArguments("--window-size=1920,1080");// Full hd
        // chromeOptions.addArguments("--window-size=1280,720");
        // chromeOptions.addArguments("--window-size=800,600");
        // chromeOptions.addArguments("--incognito");
      //  chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://google.com");



        Thread.sleep(10000);
        driver.quit();
    }
}
