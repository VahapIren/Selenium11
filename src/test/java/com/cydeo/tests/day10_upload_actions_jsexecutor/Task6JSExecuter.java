package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task6JSExecuter {
    @Test
    public void javascript_executor_test1() {
        //TC #6: Scroll using JavascriptExecutor
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        //((JavascriptExecutor)Driver.getDriver()).executeScript("");

        //3- Use below JavaScript method and scroll
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();

        //a. 750 pixels down 10 times.
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");

        }

        //b. 750 pixels up 10 times
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");

        }
        Actions actions=new Actions(Driver.getDriver());
        WebElement h3=Driver.getDriver().findElement(By.tagName("h3"));
        actions.moveToElement(h3).perform();

        //JavaScript method to use : window.scrollBy(0,0)
    }
}
