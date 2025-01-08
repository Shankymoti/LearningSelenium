package com.shashankkumar.ex14RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.SortedMap;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class TestSelenium_RL_Part2 {


    WebDriver driver;
    @Test
    public void testSeleniumRLP2(){
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.switchTo().frame("result");
        driver.findElement(By.xpath("//*[@id='form']//button")).click();

        WebElement usernameTxt = driver.findElement(By.xpath("//*[@id='username']"));
        System.out.println("Step1");
       WebElement errormsgElement = driver.findElement(with(By.tagName("small")).below(usernameTxt));
        System.out.println("step2");
       String errorMsg = errormsgElement.getText();

        Assert.assertEquals(errormsgElement.isDisplayed(),true);
        Assert.assertEquals(errorMsg,"Username must be at least 3 characters");



    }
}
