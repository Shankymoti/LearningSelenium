package com.shashankkumar.ex07_webtable;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium22 {

WebDriver driver;
    @BeforeTest
public void setup(){
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        /*
        This line sets the page load strategy for how Selenium should handle page loads in Chrome.

Explanation:

PageLoadStrategy.NORMAL tells the WebDriver to wait until the entire page is loaded before proceeding. In this mode, the WebDriver will wait for the document to be fully loaded and ready, including all JavaScript, images, and other resources. This is the default behavior.
There are other strategies available, like:
PageLoadStrategy.EAGER: Waits for the DOM to be ready (but doesn't wait for everything like images or scripts to load).
PageLoadStrategy.NONE: Doesn’t wait for the page to load at all, proceeding with the script even before the page has finished loading.
Use Case: You would use this setting when you want the script to wait for the full content of the page to be loaded before interacting with elements on it.
         */
        chromeoptions.addArguments("--guest");
        /*

        The argument "--guest" launches Chrome in Guest Mode.
Guest Mode is a special browser session where the user does not have any saved data (like history, bookmarks, or cookies). Essentially, it's a temporary session without personalization or any logged-in user state.
Using this flag could be useful for scenarios where you want to test the website in an anonymous or fresh state without any personal data affecting the results.
Use Case: This would be used when testing how the application behaves without any browser history, cache, or user-specific data that could influence the test results.
         */
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        String url = "https://awesomeqa.com/webtable1.html";
        driver.get(url);

}
@Owner("shashank")
@Description(" To print all Dynamic table data")
@Test
public void testSelenium22(){
    WebElement table = driver.findElement(By.xpath("//*[@summary='Sample Table']/tbody"));

    List<WebElement> rows = table.findElements(By.tagName("tr"));

    for (int i=0; i<rows.size(); i++){
        List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
        for(WebElement col : cols){
            System.out.println(col.getText());
        }
    }
}

public void closeBrowser(){

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
        //sessionid == null
}
}
