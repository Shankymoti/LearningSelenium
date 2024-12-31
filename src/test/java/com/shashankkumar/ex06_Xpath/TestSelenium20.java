package com.shashankkumar.ex06_Xpath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium20 {

    @Owner("Shashank")
    @Description("")
    @Test
    public void test_Selenium20() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement makeAppointmentBtn = driver.findElement (By.xpath("//a[contains(text(),'Make Appointment')]")); //contains has 2 arguments and arguments are separated by ,
        makeAppointmentBtn.click();
    Thread.sleep(2000);
        List<WebElement> userNameTextBoxes = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        userNameTextBoxes.get(1).sendKeys("John Doe");

        List<WebElement> passwordTextBoxes = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        passwordTextBoxes.get(1).sendKeys("ThisIsNotAPassword");

        WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']")); // use = with text
        loginBtn.click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");


        Thread.sleep(5000);
        driver.quit();
        // It will close all the tabs. - session id == null


    }
}
