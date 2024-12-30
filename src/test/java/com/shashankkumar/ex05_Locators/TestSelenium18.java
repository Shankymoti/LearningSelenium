package com.shashankkumar.ex05_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium18 {

    @Owner("shashank")
    @Description("Use of link text and partial link text")
    @Test
    public void test_Selenium18() throws InterruptedException {
    ChromeOptions chromeOptions = new ChromeOptions();

    chromeOptions.addArguments("--window-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        //driver.navigate().to("https://app.vwo.com/#/login"); we can use this also
        driver.get("https://app.vwo.com/#/login");// mostly we use this

      //  <a
        //  href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        //  class="text-link"
        //  data-qa="bericafeqo">
        //  Start a free trial
        //  </a>

        // LinkText contains Full match
        WebElement linkFullText = driver.findElement(By.linkText("Start a free trial"));
        linkFullText.click();

        // PartialLinkText contains partial text
        WebElement linkPartialText =  driver.findElement(By.partialLinkText("Start a free"));
        linkPartialText.click();

        //Start a free trial
        //a free trial
        //free trial
        //trial
        // Start


        Thread.sleep(4000);
        driver.quit();
    }

}
