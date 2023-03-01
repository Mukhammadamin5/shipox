package com.shipox.tests.basics;

import com.github.javafaker.Faker;
import com.shipox.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Drivers {

    @Test
    public void drivers() throws InterruptedException {
        Driver.getDriver().get("https://test1234-app.qa.shipox.com");

        Faker faker = new Faker();

        Thread.sleep(2000);

        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("moblakulov5@gmail.com");
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("Test1234");
        Driver.getDriver().findElement(By.xpath("//button[@data-cy='signInButton']")).click();


        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiPaper-root MuiAccordion-root jss4 false false MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded'])[7]")).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[3]")).click();

        Driver.getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("test"+ faker.numerify("###") +"@gmail.com");
        Driver.getDriver().findElement(By.xpath("//input[@name='firstName']")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.xpath("//input[@name='lastName']")).sendKeys(faker.name().lastName());

        Driver.getDriver().findElement(By.xpath("//input[@class='form-control ']")).sendKeys("912345678");
        Driver.getDriver().findElement(By.xpath("//input[@name='birthDate']")).click();
        Driver.getDriver().findElement(By.xpath("//h6[@class='MuiTypography-root MuiPickersToolbarText-toolbarTxt MuiTypography-subtitle1']")).click();
        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiTypography-root MuiPickersYear-root MuiTypography-subtitle1'])[101]")).click();
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary'])[2]")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[1]")).click();
        Driver.getDriver().findElement(By.xpath("//li[@data-value='male']")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[2]")).click();
        Driver.getDriver().findElement(By.xpath("//li[@data-value='active']")).click();

        Driver.getDriver().findElement(By.xpath("//span[@class='MuiButton-label']")).click();
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("Test1234");
        Driver.getDriver().findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[1]")).sendKeys("test1234");
        Driver.getDriver().findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[2]")).sendKeys("test1234");

        //Thread.sleep(2000);
        //Driver.getDriver().findElement(By.xpath("(//span[@class='MuiButton-label'])[3]")).click();

    }
}
