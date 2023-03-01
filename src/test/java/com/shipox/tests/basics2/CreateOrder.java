package com.shipox.tests.basics2;

import com.github.javafaker.Faker;
import com.shipox.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.security.Key;

public class CreateOrder {
    Faker faker = new Faker();
    @Test
    public void createOrder() throws InterruptedException{
        Driver.getDriver().get("https://test1234-my.qa.shipox.com/");
        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("+998222345678");
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("Test1234");
        Driver.getDriver().findElement(By.xpath("//button[@data-cy='signInButton']")).click();

        Thread.sleep(4000);
        Driver.getDriver().findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined']")).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//span[@class='MuiButton-label']")).click();
        Driver.getDriver().findElement(By.xpath("//input[@name='pickupCompanyName']")).sendKeys(faker.company().name());
        Driver.getDriver().findElement(By.xpath("//input[@name='pickupContactEmail']")).sendKeys("test"+ faker.numerify("###") +"@gmail.com");

        // city
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='City  *']")).sendKeys("Tashkent");
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='City  *']")).sendKeys(Keys.DOWN, Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='Neighborhood']")).sendKeys("Olmazor district");
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='Neighborhood']")).sendKeys(Keys.DOWN, Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("//input[@name='pickupLocationAddress']")).sendKeys(faker.address().fullAddress());
//
        Driver.getDriver().findElement(By.xpath("//input[@name='pickupStreet']")).sendKeys("streetN " + faker.numerify("##"));
        Driver.getDriver().findElement(By.xpath("//input[@name='pickupBuilding']")).sendKeys("building1");
        Driver.getDriver().findElement(By.xpath("//input[@name='pickupApartment']")).sendKeys("building2");
        Driver.getDriver().findElement(By.xpath("//button[@class='MuiButtonBase-root MuiFab-root']")).click();

    }

    @Test
    public void dropOffLoc() throws InterruptedException{

        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();

        Driver.getDriver().findElement(By.xpath("//input[@name='dropoffContactName']")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.xpath("//input[@name='dropoffCompanyName']")).sendKeys(faker.company().name());
        Driver.getDriver().findElement(By.xpath("//input[@class='form-control ']")).sendKeys("912345678");
        Driver.getDriver().findElement(By.xpath("//input[@name='dropoffContactEmail']")).sendKeys("test"+ faker.numerify("###") +"@gmail.com");
        Driver.getDriver().findElement(By.xpath("//input[@name='reference_id']")).sendKeys(faker.numerify("###"));

        // city
//        Driver.getDriver().findElement(By.xpath("//input[@placeholder='City *']")).sendKeys("Tashkent" + Keys.DOWN + Keys.ENTER);
//        Driver.getDriver().findElement(By.xpath("//input[@placeholder='Neighborhood']")).sendKeys("Olmazor district" + Keys.DOWN + Keys.ENTER);

        Driver.getDriver().findElement(By.xpath("//input[@placeholder='City *']")).sendKeys("Tashkent");
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='City *']")).sendKeys(Keys.DOWN, Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='Neighborhood']")).sendKeys("Olmazor district");
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='Neighborhood']")).sendKeys(Keys.DOWN, Keys.ENTER);

        Driver.getDriver().findElement(By.xpath("//input[@name='dropoffStreet']")).sendKeys("streetN " + faker.numerify("##"));
        Driver.getDriver().findElement(By.xpath("//input[@name='dropoffLocationAddress']")).sendKeys(faker.address().fullAddress());
        Driver.getDriver().findElement(By.xpath("//input[@name='dropoffBuilding']")).sendKeys("building1");
        Driver.getDriver().findElement(By.xpath("//input[@name='dropoffApartment']")).sendKeys("building2");
        Driver.getDriver().findElement(By.xpath("//button[@class='MuiButtonBase-root MuiFab-root']")).click();

        Driver.getDriver().findElement(By.xpath("//input[@name='termsAndConditions']")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//input[@name='notProhibitedProducts']")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//button[@class='MuiButtonBase-root MuiFab-root']")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@role='button'])[10]")).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//div[@role='button'])[11]")).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//div[@role='button'])[11]")).click();
        Driver.getDriver().findElement(By.xpath("(//button[@type='button'])[3]"));
        Driver.getDriver().findElement(By.xpath("//input[@name='codCharge']")).sendKeys("10000");
        Driver.getDriver().findElement(By.xpath("//input[@name='acceptCodTerms']")).click();
        Driver.getDriver().findElement(By.xpath("//button[@class='MuiButtonBase-root MuiFab-root']")).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//button[@type='button'])[3]")).click();
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text'])[1]")).click();
        Driver.getDriver().findElement(By.xpath("(//button[@type='button'])[3]")).click();

        //Thread.sleep(4000);
        //Driver.getDriver().findElement(By.partialLinkText("TRACK THE ORDER")).click();

    }
}
