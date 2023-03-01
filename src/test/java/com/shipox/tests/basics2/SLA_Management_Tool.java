package com.shipox.tests.basics2;

import com.github.javafaker.Faker;
import com.shipox.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SLA_Management_Tool {

    @Test
    public void createSLA() throws InterruptedException{

        Driver.getDriver().get("https://test1234-app.qa.shipox.com");

        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("moblakulov5@gmail.com");
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("Test1234");
        Driver.getDriver().findElement(By.xpath("//button[@data-cy='signInButton']")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiAccordionSummary-content jss7'])[12]")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiPaper-root paper-0-3823 enabled-0-3824 MuiPaper-elevation1 MuiPaper-rounded'])[5]")).click();
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[3]")).click();
        Driver.getDriver().findElement(By.xpath("//input[@name='name']")).sendKeys("test2");
        Driver.getDriver().findElement(By.xpath("//div[@class='MuiButtonBase-root MuiAccordionSummary-root']")).click();
        Driver.getDriver().findElement(By.xpath("//input[@class='jss82 MuiSwitch-input']")).click();
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text'])[2]")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[4]")).click();
        Driver.getDriver().findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button'])[1]")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[6]")).click();
        Driver.getDriver().findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button'])[4]")).click();

        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text'])[2]")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[7]")).click();
        Driver.getDriver().findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button'])[2]")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[9]")).click();
        Driver.getDriver().findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button'])[3]")).click();

        Driver.getDriver().findElement(By.xpath("//input[@type='number']")).sendKeys("2");

        Driver.getDriver().findElement(By.xpath("//button[@class='MuiButtonBase-root MuiFab-root root-0-9495 MuiFab-primary']")).click();
    }
}
