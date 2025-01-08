package com.shashankkumar.ex12ActionAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium031_Actions_DragDrop {

    WebDriver driver;
    @BeforeTest
public void startBrowser(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
}


@Test
public void testSeleniumDragAndDrop() {


    WebElement from = driver.findElement(By.id("column-a"));
    WebElement to = driver.findElement(By.id("column-b"));

    Actions actions = new Actions(driver);
    actions.dragAndDrop(from,to).build().perform();
// or we can also use
   // actions.moveToElement(from).moveToElement(to).release(to).build().perform();

}

public void closeBrowser(){
        try
        {
            Thread.sleep(3000);
        }catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        driver.close();
}
}
