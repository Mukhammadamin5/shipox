package com.shipox.tests.demo;

import com.shipox.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo {

    @Test
    public void demo() throws InterruptedException{
        Driver.getDriver().get("https://shipox.com/request-a-demo/");

        WebElement aa = Driver.getDriver().findElement(By.xpath("//button[@class='uiButton private-button private-button--tertiary-light private-button--sm private-button-select-group__option private-button--non-responsive private-button--non-link']"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("document.getElementByClass('uiButton private-button private-button--tertiary-light private-button--sm private-button-select-group__option private-button--non-responsive private-button--non-link').checked=false;");
//
//        WebElement ten = Driver.getDriver().findElement(By.xpath("(//div[@class='uiButton private-button private-selectable-box time-picker-btn private-button--block'])[2]"));
//
//        ten.click();

//        Select dropDown = new Select(Driver.getDriver().findElement(By.xpath("//div[@id='timezone-select-label']")));
//
//        Thread.sleep(3000);
//
//        dropDown.selectByVisibleText("//button[@title='UTC +02:00 Beirut']");

//        Driver.getDriver().findElement(By.xpath("//span[@class='uiDropdown__buttonCaret private-dropdown__caret']")).click();



    }
}
