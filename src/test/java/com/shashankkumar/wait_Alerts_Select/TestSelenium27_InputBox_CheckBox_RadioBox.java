package com.shashankkumar.wait_Alerts_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium27_InputBox_CheckBox_RadioBox {
    @Test
    public void testSelenium36_InputBox_CheckBox_RadioBox(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");

        //InputBox
        driver.findElement(By.name("firstname")).sendKeys("Shashank");

        //Radio Button
        driver.findElement(By.id("sex-0")).click();

        //CheckBox
        driver.findElement(By.id("profession-1")).click();

    }
}
