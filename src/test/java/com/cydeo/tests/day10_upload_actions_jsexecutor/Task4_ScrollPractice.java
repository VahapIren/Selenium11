package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task4_ScrollPractice {
    @Test
    public void scroll_test(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Actions actions=new Actions(Driver.getDriver());
        WebElement powered=Driver.getDriver().findElement(By.xpath("//div[@id='page-footer']/div/div"));
        actions.moveToElement(powered);
        actions.perform();
        Assert.assertTrue(powered.isDisplayed());
    }
}
