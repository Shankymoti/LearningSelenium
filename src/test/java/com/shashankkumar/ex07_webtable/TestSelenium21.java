package com.shashankkumar.ex07_webtable;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium21 {

WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://awesomeqa.com/webtable.html");
    }
    @Owner("Shashank")
    @Description("Static Table")
    @Test
    public void testSelenium21(){
////table[@id='customers']/tbody/tr[2]/td[1]
        String firstPart = "//table[@id='customers']/tbody/tr[";
        String secondPart ="]/td[";
        String thirdPart = "]";
        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();


        for (int i =2; i<=row; i++){
            for (int j=1; j<=col; j++){
                String dynamic_path = firstPart+i+secondPart+j+thirdPart;
              //  System.out.println(dynamic_path);
               // System.out.println(firstPart+i+secondPart+j+thirdPart);
                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.println(data);
                if(data.contains("Helen Bennett")){
                    String country_Path = dynamic_path+"/following-sibling::td";
                    String country = driver.findElement(By.xpath(country_Path)).getText();
                    System.out.println("Helen Bennett living in "+country);
                }
            }
        }


    }

    @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(4000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}
