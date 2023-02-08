package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractices {
    @Test
    public void dynamic_load_7_test() {
        //1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        //2. Wait until title is “Dynamic title”
        //creating the wait object to be able to create certain condition to wait
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        //use the "wait" object to create our expected condition
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //Create object of DynamicLoad7Page to reach and assert web elements
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        //3. Assert: Message “Done” is displayed.
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        BrowserUtils.sleep(5);

        //4. Assert: Image is displayed
        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());

    }

    @Test
    public void dynamic_load_1_test() {
        //1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        DynamicLoad1Page dynamicLoad1Page=new DynamicLoad1Page();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

        dynamicLoad1Page.startButton.click();

        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        Assert.assertTrue(dynamicLoad1Page.username.isDisplayed());

        dynamicLoad1Page.username.sendKeys("tomsmithh");

        dynamicLoad1Page.password.sendKeys("123456");

        dynamicLoad1Page.submitButton.click();

        wait.until(ExpectedConditions.visibilityOf(dynamicLoad1Page.errorMessage));

        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());





    }
}