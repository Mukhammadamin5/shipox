package com.shipox.tests.login;

import com.shipox.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {

    WebDriver driver;

    @Test
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://shipox.com/");

        WebElement loginBtn = driver.findElement(By.linkText("Login"));
        loginBtn.click();

        WebElement loginText = driver.findElement(By.xpath("//input[@id='loginName']"));
        loginText.sendKeys("oblakulovmukhammadamin@gmail.com");

        driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
        driver.findElement(By.xpath("//div[@class='companies_list']")).click();

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Test298355");

//        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

    }




}
