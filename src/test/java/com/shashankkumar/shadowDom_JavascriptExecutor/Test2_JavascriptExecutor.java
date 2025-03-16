package com.shashankkumar.shadowDom_JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test2_JavascriptExecutor {
    WebDriver driver = new ChromeDriver();
    @Test
    public void test_js2() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://selectorshub.com/xpath-practice-page/");
//        WebElement element = driver.findElement(By.id("userName"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
//        Thread.sleep(5000);

//        WebElement pizzatxtBox = (WebElement) js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\");");
//        pizzatxtBox.sendKeys("italian pizza");

        JavascriptExecutor js = (JavascriptExecutor)driver;


        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));
       js.executeScript("arguments[0].scrollIntoView(true);",div_to_scroll);

        Thread.sleep(3000);

        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"#pizza\");");
        inputboxPizza.sendKeys("farmhouse");
    }
}
