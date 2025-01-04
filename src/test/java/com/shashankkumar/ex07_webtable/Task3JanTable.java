package com.shashankkumar.ex07_webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Task3JanTable {
    WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    }

    @Test
    public void testSelenium(){
        WebElement table = driver.findElement(By.xpath("//div[@class='oxd-table orangehrm-employee-list']/div[2]"));

        List<WebElement> rows = table.findElements(By.tagName("div"));
     for(int i =0; i<rows.size(); i++){
         List<WebElement> cols = rows.get(i).findElements(By.tagName("div"));
         for (WebElement col : cols){
             System.out.println(col.getText());
//             if(col.getText().contains("Terminated")){
//                 driver.findElement(By.xpath("//div[@class='oxd-table orangehrm-employee-list']/div[2]/div[1]/div/div//button[1]")).click();
//                 driver.findElement(By.xpath("//button[contains(@class,'oxd-button--label-danger')]")).click();
//                 break;
 //            }
         }
     }
    }
}
