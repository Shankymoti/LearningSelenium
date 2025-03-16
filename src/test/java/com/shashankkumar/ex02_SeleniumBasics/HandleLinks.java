package com.shashankkumar.ex02_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.internal.EclipseInterface;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class HandleLinks {
  //  ChromeOptions chromeOptions = new ChromeOptions();
    WebDriver driver;
    @BeforeClass
    public void setup(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
    }

@Test
    public void handleLinks() {

        driver.get("https://www.amazon.in/");
        driver.findElement(By.linkText("Today's Deals")).click();
        //Capture all links

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("total Links " + links.size());

        // To print linkText and link

        for (WebElement link : links) {
            String linktext = link.getText();
            String getLink = link.getAttribute("href");
            String getLink2 = link.getDomAttribute("href");

            System.out.println("link text is " + linktext + "Get Link " + getLink2 + "   " + getLink);
        }
    }
// Handle Broken links
        @Test
        public void handleBrokenLinks() throws MalformedURLException {

            driver.get("http://www.deadlinkcity.com/");
            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println(links.size());
            int brokenlink = 0;
            for (WebElement element : links) {
                String url = element.getAttribute("href");
                if (url == null || url.isEmpty()) {
                    System.out.println("URL is empty");
                    continue;
                }
                    //Convert String to URL
                    URL link = new URL(url);
                    try {
                        HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
                        httpconn.connect();

                        if (httpconn.getResponseCode() >= 400) {
                            System.out.println(httpconn.getResponseCode() + " " + url + " " + link + " is Broken link");
                        } else {
                            System.out.println(httpconn.getResponseCode() + " is valid link");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }



            }
        }



}
