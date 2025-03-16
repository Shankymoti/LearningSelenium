package com.shashankkumar.shadowDom_JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1_JavascriptExecutor {

    /*
    in console :
    alert(11)
    alert("shashank)
    document.title
    document.getElementById("login-username")   ---- use this //https://app.vwo.com/#/login
document.querySelector("#login-username")
document.querySelectorAll("#login-username")

     */
WebDriver driver = new ChromeDriver();
    @Test
    public void tc_javascriptExecutor(){
        driver.get("https://app.vwo.com/#/login");
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        js.executeScript("alert(1)");
        driver.switchTo().alert().accept();
//        js.executeScript("alert(Hello World?)");
//        driver.switchTo().alert().accept();
    }
}
