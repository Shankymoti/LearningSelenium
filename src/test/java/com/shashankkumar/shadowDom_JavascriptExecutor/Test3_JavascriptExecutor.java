package com.shashankkumar.shadowDom_JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test3_JavascriptExecutor {
    WebDriver driver = new ChromeDriver();
    @Test
    public void test_js2(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://selectorshub.com/xpath-practice-page/");
        WebElement element = driver.findElement(By.id("userName"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("arguments[0].scrollIntoView(true);", element);

js.executeScript("window.scrollBy(0,500)");
String url = js.executeScript(" return document.URL").toString();
        System.out.println(url);
        String title = js.executeScript("return document.title").toString();
        System.out.println(title);



    }
}
