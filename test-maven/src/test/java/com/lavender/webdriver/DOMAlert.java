package com.lavender.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 08/03/16.
 */
public class DOMAlert {

    @Test
    public void startWebDriver(){
        System.setProperty("webdriver.chrome.driver", "/home/user/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 800));

        driver.navigate().to("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.cssSelector("input[value='Confirmation Alert']")).click();
        driver.switchTo().alert().accept();
    }

}
