package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task5_Scroll {
    @Test
    public void scroll_test(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Actions actions=new Actions(Driver.getDriver());
        WebElement powered=Driver.getDriver().findElement(By.xpath("//div[@id='page-footer']/div/div"));
        actions.moveToElement(powered);
        actions.perform();
        Assert.assertTrue(powered.isDisplayed());


        BrowserUtils.sleep(2);
        WebElement home=Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
//scroll up a page
        for (int i = 0; i <4;i++) {
            actions.sendKeys(Keys.PAGE_UP).perform();
            BrowserUtils.sleep(1);
        }
        Assert.assertTrue(home.isDisplayed());

        home.click();

//scroll down a page
        //actions.sendKeys(Keys.PAGE_DOWN).build().perform();

    }
}
