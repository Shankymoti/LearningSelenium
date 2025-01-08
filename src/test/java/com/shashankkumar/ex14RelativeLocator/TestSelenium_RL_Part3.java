package com.shashankkumar.ex14RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import java.util.List;

public class TestSelenium_RL_Part3 {

    WebDriver driver;
    @Test
    public void testSelenium(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");

        List<WebElement> locationList = driver.findElements(By.xpath("//*[contains(@class,'location-name')]"));

        for (WebElement loc : locationList){
               String rank =  driver.findElement(with(By.xpath("//*[contains(@class,'location-rank')]")).toLeftOf(loc)).getText();
               String aqi = driver.findElement(with(By.xpath("//*[contains(@class,'aqi-level')]")).toRightOf(loc)).getText();
            System.out.println("rank = "+rank+" aqi = "+aqi);
        }
    }
}
