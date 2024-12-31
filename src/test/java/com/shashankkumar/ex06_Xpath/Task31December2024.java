package com.shashankkumar.ex06_Xpath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task31December2024 {
    @Owner("Shashank")
    @Description("Verify msg post login")
    @Test
    public void test_Task31December() {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.idrive360.com/enterprise/login");


        WebElement mailTextBox = driver.findElement(By.xpath("//input[@id='username']"));
        mailTextBox.sendKeys("augtest_040823@idrive.com");

        WebElement passwordTextBox = driver.findElement(By.xpath("//*[contains(@id,'password')]"));
        passwordTextBox.sendKeys("123456");

        WebElement signInButton = driver.findElement(By.xpath("//*[contains(@id,'frm-btn')]"));
        signInButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

       // <div _ngcontent-hik-c9="" class="id-loader-section" id="upgradesec"><i _ngcontent-hik-c9=""></i></div>

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[contains(@id,'frm-btn')]")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("upgradesec")));

        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Your free trial has expired']")));
        if(msg.isDisplayed()){
            System.out.println("Message is visible");
            Assert.assertTrue(true);
        }else {
            System.out.println("Message is not visible");
            Assert.assertFalse(true);
        }

    }
}
