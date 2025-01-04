package com.shashankkumar.ex08_SVGElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium24 {

    WebDriver driver;

    @Test
    public void testSelenium24() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://www.amcharts.com/svg-maps/?map=india");

        // //*[name()='svg']/*[local-name()='g'][7]//*[name()='g']/*[name()='g']/*[name()='path']

        ///*[name()='svg']//*[local-name()='g'][7]//*[name()='g']//*[name()='g']//*[local-name()='path']

        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[local-name()='g'][7]//*[name()='g']/*[name()='g']/*[name()='path']"));
        for(WebElement state : states){
            Thread. sleep(1000);
            System.out.println(state.getAttribute("aria-label"));
            if(state.getAttribute("aria-label").contains("Tripura")){
                state.click();
            }
        }

    }
}
