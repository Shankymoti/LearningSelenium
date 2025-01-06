package com.shashankkumar.wait_Alerts_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium28_Select_Static {

    @Test
    public void testSeleniumStaticSelect() {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropDownElement =  driver.findElement(By.id("dropdown"));
        Select dropDown  =  new Select(dropDownElement);

       // dropDown.selectByIndex(1);
       // dropDown.selectByValue("2");
       dropDown.selectByVisibleText("Option 1");
    }

}