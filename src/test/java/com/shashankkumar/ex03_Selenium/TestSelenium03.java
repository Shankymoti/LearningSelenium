package com.shashankkumar.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Description(" ")
    @Test
    public void test_Selenium01(){
        //Selenium 3 #you need to setup driver(browser)
       // System.getProperty("webdriver.gecko.driver","path/geckodriver");

        //Selenium 4
        //Selenium Manager : utility - which will download the driver automatically


        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");

    }
}
