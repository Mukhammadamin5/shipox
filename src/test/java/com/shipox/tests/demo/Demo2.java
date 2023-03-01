package com.shipox.tests.demo;

import com.shipox.utilities.Driver;
import com.shipox.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Demo2 {

    WebDriver driver;

    @Test
    public void demo() throws InterruptedException{
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://shipox.com/request-a-demo/");

        Thread.sleep(5000);

        WebElement ten = driver.findElement(By.xpath("(//div[@class='uiButton private-button private-selectable-box time-picker-btn private-button--block'])[3]"));

        ten.click();


    }
}
