package com.shipox.tests.basics;

import com.github.javafaker.Faker;
import com.shipox.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Customers {

    @Test
    public void customers() throws InterruptedException{
        Driver.getDriver().get("https://test1234-app.qa.shipox.com");

        Faker faker = new Faker();

        Thread.sleep(2000);

        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("moblakulov5@gmail.com");
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("Test1234");
        Driver.getDriver().findElement(By.xpath("//button[@data-cy='signInButton']")).click();


        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiPaper-root MuiAccordion-root jss4 false false MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded'])[9]")).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[4]")).click();

        Driver.getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("test"+ faker.numerify("###") +"@gmail.com");
        Driver.getDriver().findElement(By.xpath("//input[@name='firstName']")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.xpath("//input[@name='lastName']")).sendKeys(faker.name().lastName());

        Driver.getDriver().findElement(By.xpath("//input[@class='form-control ']")).sendKeys("912345678");

        Driver.getDriver().findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']")).sendKeys("Uzbekistan");

        Driver.getDriver().findElement(By.xpath("//span[@class='MuiButton-label']")).click();
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("Test1234");

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[1]")).click();
        Driver.getDriver().findElement(By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[2]")).click();
        Driver.getDriver().findElement(By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[3]")).click();
        Driver.getDriver().findElement(By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']")).click();

    }
}
