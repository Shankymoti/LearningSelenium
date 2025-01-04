package com.shashankkumar.ex08_SVGElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium23 {
    @Test
    public void testSelenium(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        try {
            Thread.sleep(4000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("macmini");
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();
    }

}
