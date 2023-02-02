package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.text.html.HTML;

public class Task2Upload {
    @Test
    public void upload_test() {
        //TC #2 Upload Test
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        String path="D:\\BITEN KURSLAR- SINAVLAR\\VAHAP+FORM\\SDET\\HTML Class\\liverpool.jpeg";

        WebElement fileUpload=Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));

        BrowserUtils.sleep(2);
        //fileUpload.click();
        fileUpload.sendKeys(path);

        WebElement uploadBtn=Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));
        uploadBtn.click();

        WebElement fileUploaded=Driver.getDriver().findElement(By.xpath("//h3"));


        Assert.assertTrue(fileUploaded.isDisplayed());




    }
}
