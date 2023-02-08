package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {
    public DynamicLoad1Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(xpath = "//div[@id='loading']")
    // @FindBy(css = "div#loading")
    public WebElement loadingBar;

    @FindBy(xpath = "//input[@name='username']")
    // //@FindBy(id = "username")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    //@FindBy(css = "#pwd")
    public WebElement password;

    @FindBy(xpath = "//button[.='Submit']")
    //
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id='flash']")
    public WebElement errorMessage;



}
