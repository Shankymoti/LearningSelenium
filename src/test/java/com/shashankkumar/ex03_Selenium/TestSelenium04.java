package com.shashankkumar.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestSelenium04 {

    @Description("")
    @Test
    public void testSelenium04(){
        // Webdriver hierarchy

        // SearchContext(I) -> (2) -> WebDriver(I)( 10) eg-> RemoteWebDriver(C) (15)
        // -> ChromiumDriver(C) 25 -> EdgeDriver(C) (45)


        //SearchContext(I)
        // -> WebDriver(I)
        // -> RemoteWebDriver(C) ->
        // ChromeiumDriver(C) ->
        // ChromeDriver(C)


        //SearchContext(Interface)  -- findElement(),findElements() -- GGF
        // -> WebDriver(Interfaxce)  -- it has some incomplete function -- GF
        // -> RemoteWebDriver(Class)  -- it also have some function  -- F
         // ChromeDriver, EdgeDriver. FirefoxDriver. InternetExplorerDriver, SafariDriver - Class -S


//        SearchContext driver = new ChromeDriver();  -- possible
//        WebDriver driver1 =  new ChromeDriver();   -- possible
//        RemoteWebDriver driver2 = new ChromeDriver();   -- possible
//        ChromeDriver driver3 =  new ChromeDriver();   -- possible


        //Scenarios
        //1. Do you want to run on Chrome Drivero or Edge Driver

        ChromeDriver driver = new ChromeDriver();  // 1%


        // 2. Do  you want to run on Chrome and then Edge then Fire fox
        WebDriver driver1 = new ChromeDriver(); // 97%
        driver1 =  new FirefoxDriver(); // 97%
        driver1 =  new EdgeDriver(); //97%


        //3. Do you want to run it on multiple browser :  aws machine - > 2%

        //RemoteWebDriver driver (with grid)










    }
}
