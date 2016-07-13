package com.lavender.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 08/03/16.
 */
public class DropdownTest {

    @Test
    public void startWebDriver(){
        System.setProperty("webdriver.chrome.driver", "/home/user/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 800));
        driver.navigate().to("http://spicejet.com/");
        //driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
        //driver.findElement(By.xpath("//a[@value='GOI']")).click();
        driver.findElement(By.cssSelector("select#ctl00_mainContent_ddl_Adult")).click();

        //Select dropdown=new Select();
    }
}
