package com.shashankkumar.ex14RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class TestSelenium_RL_Part1 {

    @Test
    public void testSelenium(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://awesomeqa.com/practice.html");
       WebElement spanElement = driver.findElement(By.xpath("//*[text()='Years of Experience']"));

       driver.findElement(with(By.id("exp-2")).toRightOf(spanElement)).click();

       driver.close();
    }
}
