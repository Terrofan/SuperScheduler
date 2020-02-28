package com.telran.scheduler.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperBase {
    AppiumDriver driver;
    WebDriverWait wait;

    public HelperBase(AppiumDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public void tap(By locator){
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) throws InterruptedException, Exception {
        if(text != null) {
            tap(locator);
            Thread.sleep(3000);
            driver.hideKeyboard();
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }else {
            throw new Exception("Text cannot be empty");
        }
    }

    public boolean isElementPresent(By locator){

        return driver.findElements(locator).size() > 0;
    }
}
