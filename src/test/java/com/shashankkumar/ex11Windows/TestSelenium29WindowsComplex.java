package com.shashankkumar.ex11Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class TestSelenium29WindowsComplex {

    WebDriver driver;
    @BeforeTest
    public void setup() throws InterruptedException {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
    Thread.sleep(5000);
    }
    @Test
    public void testSelenium() throws InterruptedException {
        String parentwindowID = driver.getWindowHandle();
        System.out.println(parentwindowID);

    List<WebElement> list = driver.findElements(By.xpath("//*[@data-qa='danawobuqa']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(list.get(1)).click().build().perform();
        Thread.sleep(13000);

        Set<String> windowIds = driver.getWindowHandles();
        System.out.println(windowIds);

        for (String wid : windowIds){
           if (!parentwindowID.equals(wid)) {
               driver.switchTo().window(wid);
               driver.switchTo().frame("heatmap-iframe");
               WebElement clickbtn = driver.findElement(By.cssSelector("[data-qa='refoyekife']"));
               clickbtn.click();
           }
        }
    }


}
