package com.shashankkumar.ex05_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MiniProjectKatalon {

    @Owner("Shashank")
    @Description("Mini Project Katalon")
    @Test
    public void miniProject() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement makeAppointBtn = driver.findElement(By.linkText("Make Appointment"));
        makeAppointBtn.click();

        String username = driver.findElement(By.xpath("(//input[@placeholder='Username'])[1]")).getAttribute("value");
        System.out.println(username);
        String password = driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]")).getDomAttribute("value");
        System.out.println(password);

        driver.findElement(By.id("txt-username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

        driver.findElement(By.id("btn-login")).click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        if(driver.getCurrentUrl().contains("https://katalon-demo-cura.herokuapp.com/#appointment"))
        {
            System.out.println("Expected Current UrL");
            Assert.assertTrue(true);
        }else {
            System.out.println("Current URl is not as per expection");
            System.out.println("Test Case failed");
            Assert.assertFalse(true);
        }
        WebElement dropDown = driver.findElement(By.id("combo_facility"));
        Select dd = new Select(dropDown);
      //  dd.selectByValue("Seoul CURA Healthcare Center");
      // dd.selectByIndex(0);
      //  dd.selectByVisibleText("Hongkong CURA Healthcare Center");

        List<WebElement> allOptions =  dd.getOptions();
        for (WebElement option : allOptions){
            if(option.getText().equals("Hongkong CURA Healthcare Center")){
                option.click();
                break;
            }
        }
        driver.findElement(By.name("hospital_readmission")).click();

        driver.findElement(By.id("radio_program_medicaid")).click();

        driver.findElement(By.name("visit_date")).click();

        //Select 31 December 2024
     /*   List<WebElement> dates = driver.findElements(By.xpath("//table[@class='table-condensed']//tbody//td"));
        for(WebElement date : dates){
            if(date.getText().equals("31")){
                date.click();
                break;
            }
        }
*/

        String date = "11";
        String month = "November";
        String year = "2025";

        while (true){
            String arr[] = driver.findElement(By.xpath("(//table[@class='table-condensed']//thead//tr[2]//th[@class='datepicker-switch'])[1]")).getText().split(" ");
            String mon = arr[0];
            String yr = arr[1];

            if(mon.equals(month) && yr.equals(year)){
                break;
            }else {
                driver.findElement(By.xpath("(//table[@class='table-condensed']//thead//tr[2]//th[@class='next'])[1]")).click();

            }
            List<WebElement> dates = driver.findElements(By.xpath("//table[@class='table-condensed']//tbody//td"));
            for (WebElement dat :  dates){
                if(dat.getText().equals("11")){
                    dat.click();
                    break;
                }
            }
        }

        driver.findElement(By.id("txt_comment")).sendKeys("Mini Project Katalon");

        driver.findElement(By.id("btn-book-appointment")).click();

        //Thread.sleep(2000);
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("appointment.php#summary"));
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Appointment Confirmation");
        Thread.sleep(3000);
        driver.quit();





    }
}