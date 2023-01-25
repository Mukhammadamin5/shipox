package com.shipox.tests.login;

import com.github.javafaker.Faker;
import com.shipox.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUp {

    WebDriver driver;

    @Test
    public void signUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://shipox.com/");
        Faker faker = new Faker();

        WebElement signUp = driver.findElement(By.linkText("Start Free Trial"));
        signUp.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@id='signUpFirstName']"));
        firstName.sendKeys(faker.name().firstName()+faker.numerify("###"));

        WebElement lastName = driver.findElement(By.xpath("//input[@id='signUpLastName']"));
        lastName.sendKeys(faker.name().lastName()+faker.numerify("###"));

        WebElement email = driver.findElement(By.xpath("//input[@id='signUpEmail']"));
        email.sendKeys(faker.name().firstName().toLowerCase() + faker.numerify("###") + "@gmail.com");

        WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
        phone.sendKeys("912345678");

        WebElement companyName = driver.findElement(By.xpath("//input[@id='signUpCompanyName']"));
        companyName.sendKeys(faker.company().name() + faker.numerify("####"));

        WebElement password = driver.findElement(By.xpath("//input[@id='signUpPassword']"));
        password.sendKeys(faker.letterify("?").toUpperCase() + faker.bothify("????####"));

//        WebElement deliv = driver.findElement(By.xpath("//label[@for='delivery_type']"));
//        deliv.click();

//        WebElement ecom = driver.findElement(By.xpath("//label[@for='ecommerce_type']"));
//        ecom.click();

//        WebElement retail = driver.findElement(By.xpath("//label[@for='retail_type']"));
//        retail.click();

        WebElement food = driver.findElement(By.xpath("//label[@for='food_delivery_type']"));
        food.click();




        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
