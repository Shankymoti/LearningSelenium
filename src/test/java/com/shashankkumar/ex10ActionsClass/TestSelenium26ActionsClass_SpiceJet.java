package com.shashankkumar.ex10ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.sql.Driver;

public class TestSelenium26ActionsClass_SpiceJet {
    @Test
    public void testSelenium26Action() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.spicejet.com/";
        driver.get(url);
        Thread.sleep(3000);
        WebElement source = driver.findElement(By.xpath("//*[@data-testid='to-testID-origin']/div/div/input"));
//        source.click();
//        source.sendKeys("BLR");

        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().sendKeys("BLR").build().perform();

        driver.quit();

    }
}
