package com.shipox.pages;

import com.shipox.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QA_ShipoxLoginPage {

    public QA_ShipoxLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@data-cy='signInButton']")
    public WebElement signInBtn;

}
