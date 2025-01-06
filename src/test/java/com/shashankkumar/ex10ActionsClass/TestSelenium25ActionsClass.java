package com.shashankkumar.ex10ActionsClass;


import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium25ActionsClass {
    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--guest");// run in guest mode
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }
    @Owner("shashank")
    @Description("Actions Class")
    @Test
    public void testSeleniumActions25(){
        driver.get("https://awesomeqa.com/practice.html");
         WebElement firstName =  driver.findElement(By.name("firstname"));
        Actions actions = new Actions(driver);
        // Enter String in Capital -
        // Keyboard
        // KeyDown + Shift -> Send Keys(type) -> Key Up
        actions
                .keyDown(Keys.SHIFT)
                .sendKeys(firstName,"Testing Academy")
                .keyUp(Keys.SHIFT)
                .build().perform();


    }

    public void browserClose(){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
