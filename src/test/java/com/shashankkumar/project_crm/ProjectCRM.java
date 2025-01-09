package com.shashankkumar.project_crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProjectCRM {
    /*
   1. Login with the Credential

   2. Add user https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser
   3.  Search User
     */


    WebDriver driver;
    @BeforeTest
    public void startBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--guest");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @Test
    public void testProjectCRM(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[contains(@class,'orangehrm-login-button')]")).click();


    }

    public void closeBrowser(){

    }
}
