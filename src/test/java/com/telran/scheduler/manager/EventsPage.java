package com.telran.scheduler.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class EventsPage extends HelperBase {
    public EventsPage(AppiumDriver driver){
        super(driver);
    }

    public boolean isPlusButtonPresent(){
        return isElementPresent(By.id("fab_main"));
    }
}
