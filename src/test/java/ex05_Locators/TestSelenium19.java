package ex05_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium19 {

    @Owner("shashank")
    @Description("Verify Error msg when we enter wrong mail")
    @Test
    public void test_Selenium19(){
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--window-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");

        WebElement emailTextBox =  driver.findElement(By.id("page-v1-step1-email"));
        emailTextBox.sendKeys("9789678fdfs435");

        WebElement checkBox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkBox.click();

        List<WebElement> btnList = driver.findElements(By.tagName("button"));
        btnList.get(0).click();

        //<div
        // class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        // </div>
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        WebElement errorMsg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(errorMsg.getText(),"The email address you entered is incorrect.");


        driver.quit();


    }
}
