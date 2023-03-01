package com.shipox.tests.basics;

import com.github.javafaker.Faker;
import com.shipox.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CourierCompanies {

    @Test
    public void signIn() throws InterruptedException{
        Driver.getDriver().get("https://test1234-app.qa.shipox.com");

        Faker faker = new Faker();

        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("moblakulov5@gmail.com");
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("Test1234");
        Driver.getDriver().findElement(By.xpath("//button[@data-cy='signInButton']")).click();


        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiPaper-root MuiAccordion-root jss4 false false MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded'])[6]")).click();

        Thread.sleep(5000);

        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[3]")).click();

        Driver.getDriver().findElement(By.xpath("//input[@name='code']")).sendKeys("Test" + faker.numerify("####"));
        Driver.getDriver().findElement(By.xpath("//input[@name='name']")).sendKeys("Test" + faker.numerify("####"));
        Driver.getDriver().findElement(By.xpath("//input[@name='website']")).sendKeys("https://www.google.com/");
        Driver.getDriver().findElement(By.xpath("//input[@name='trackingUrl']")).sendKeys("https://www.google.com/");
        Driver.getDriver().findElement(By.xpath("//input[@name='supplierEmail']")).sendKeys("test"+ faker.numerify("###") +"@gmail.com");

        Driver.getDriver().findElement(By.xpath("//input[@name='supplierPhone']")).sendKeys("12345678");
        Driver.getDriver().findElement(By.xpath("//input[@name='fax']")).sendKeys("qa");
        Driver.getDriver().findElement(By.xpath("(//input[@name='numberOfFleet'])[1]")).sendKeys("50");
        Driver.getDriver().findElement(By.xpath("//input[@name='numberOfDrivers']")).sendKeys("1");
        Driver.getDriver().findElement(By.xpath("//input[@name='dailyLimit']")).sendKeys("15");
        Driver.getDriver().findElement(By.xpath("//input[@name='dailyQuota']")).sendKeys("5");

        Driver.getDriver().findElement(By.xpath("//input[@name='prefix']")).sendKeys("qa");
        Driver.getDriver().findElement(By.xpath("//input[@name='contactFirstName']")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.xpath("//input[@name='contactLastName']")).sendKeys(faker.name().lastName());
        Driver.getDriver().findElement(By.xpath("//input[@class='form-control ']")).sendKeys("912345678");

        Driver.getDriver().findElement(By.xpath("//input[@name='contactEmail']")).sendKeys("test"+ faker.numerify("###") +"@gmail.com");
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to search...'])[2]")).sendKeys("Uzbekistan");
        Thread.sleep(1500);
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to search...'])[2]")).sendKeys(Keys.DOWN, Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to search...'])[3]")).sendKeys("Tashkent");
        Thread.sleep(1500);
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to search...'])[3]")).sendKeys(Keys.DOWN, Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("//input[@name='shippingAddress.address']")).sendKeys("Address" + faker.numerify("####"));

        Driver.getDriver().findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();
        Thread.sleep(2000);









//        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstName']"));
//        firstName.sendKeys(faker.name().firstName());
//
//        WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastName']"));
//        lastName.sendKeys(faker.name().lastName());
//
//        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
//        email.sendKeys(faker.name().firstName().toLowerCase() + faker.numerify("###") + "@gmail.com");
//
//        WebElement phone = Driver.getDriver().findElement(By.xpath("//input[@class='form-control ']"));
//        phone.sendKeys("912345678");
//
//        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
//        password.sendKeys(faker.letterify("?").toUpperCase() + faker.bothify("????####"));
//
//        Driver.getDriver().findElement(By.xpath("//input[@class='jss8']")).click();
//        Driver.getDriver().findElement(By.xpath("//button[@data-cy='signUpNextButton']")).click();
//        Driver.getDriver().findElement(By.xpath("//input[@name='companyName']")).sendKeys(faker.company().name());



        // test oblakulovmukhammadamin@gmail.com 998912345678 Test1234
    }
}
