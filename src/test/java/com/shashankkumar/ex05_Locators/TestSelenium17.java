package com.shashankkumar.ex05_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17 {

    @Owner("Shashank")
    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
       //driver.navigate().to("https://app.vwo.com/#/login"); we can use this also
        driver.get("https://app.vwo.com/#/login");// mostly we use this

        /*
        **Preference Rule**  ->

- unique ID -> name -> class Name -> TagName -> Link Text/ Partial( a tag)  - CSS Selector -> **XPath**.
- If it dynamic or changes, we try to avoid the Locator or multiple classes.  -> id="30122024abc" ->  If it is not unique we will avoid it.
- Xpath, Css Selector -> Try to find the **shortest Locator** and easy to remember, **which doesn't change much**.

         */

      //  <input  -->  open HTML Tag
        //  type="email"  -->  key == value ( attributes)
        //  class="text-input W(100%)"
        //  name="username"
        //  id="login-username"
        //  data-qa="hocewoqisi"
        //  >  -->  close HTML Tag


        // 1. Find the email inputbox and enter the email

        WebElement emailInputTextBox =  driver.findElement(By.id("login-username"));
        emailInputTextBox.sendKeys("admin@admin.com");

        // 2. Find the password inputbox and enter the password

        //<input
        // type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // >

        WebElement passwordInputTxtBox = driver.findElement(By.name("password"));
        passwordInputTxtBox.sendKeys("admin");




       // <button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
        // onclick="login.login(event)"
        // data-qa="sibequkica"
        // >

        WebElement submitButton = driver.findElement(By.id("js-login-btn"));
        submitButton.click();

        //<div
        //class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match
        // </div>

 try{
     Thread.sleep(3000);
 }catch (InterruptedException e){
     throw new RuntimeException(e);
 }

        WebElement errorMsg = driver.findElement(By.className("notification-box-description"));
       // Assert.assertEquals(errorMsg.getText(),"Your email, password, IP address or location did not match");
        String msg = errorMsg.getText();
        Assert.assertEquals(msg,"Your email, password, IP address or location did not match");


   Thread.sleep(10000);
   driver.quit();
    }

}
