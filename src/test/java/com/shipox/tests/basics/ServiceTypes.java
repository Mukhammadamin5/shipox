package com.shipox.tests.basics;

import com.github.javafaker.Faker;
import com.shipox.pages.QA_ShipoxLoginPage;
import com.shipox.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ServiceTypes {

    @Test
    public void service(){
        Driver.getDriver().get("https://test1234-app.qa.shipox.com");

        Faker faker = new Faker();

        QA_ShipoxLoginPage signIn = new QA_ShipoxLoginPage();
        signIn.inputUserName.sendKeys("moblakulov5@gmail.com");
        signIn.inputPassword.sendKeys("Test1234");
        signIn.signInBtn.click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiPaper-root MuiAccordion-root jss4 false false MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded'])[3]")).click();
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[3]")).click();

        Driver.getDriver().findElement(By.xpath("//input[@name='name']")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.xpath("//input[@name='code']")).sendKeys("Test" + faker.numerify("####"));
        Driver.getDriver().findElement(By.xpath("//input[@name='sorder']")).sendKeys("2");
        Driver.getDriver().findElement(By.xpath("//button[@data-cy='service_type_submit']")).click();





    }
}
