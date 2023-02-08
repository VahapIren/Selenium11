package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Task7 {
    @Test
    public void scroll_test(){

        Driver.getDriver().get("https://practice.cydeo.com/large");

        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i < 7; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0, 750)");
        }

        for (int i = 0; i < 7; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");
        }



    }
}
