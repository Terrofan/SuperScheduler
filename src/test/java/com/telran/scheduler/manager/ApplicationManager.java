package com.telran.scheduler.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    AppiumDriver driver;
    SessionHelper session;
    HelperBase helperBase;
    EventsPage eventsPage;

    public SessionHelper getSession() {
        return session;
    }

    public HelperBase getHelperBase(){
        return helperBase;
    }

    public EventsPage getEventsPage() {
        return eventsPage;
    }

    public void init() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","qa22");
        capabilities.setCapability("platformVersion","8.0");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage","com.example.svetlana.scheduler");
        capabilities.setCapability("appActivity",".presentation.splashScreen.SplashScreenActivity");
        capabilities.setCapability("app","C:/Users/sh_ni/Documents/GitHub/SuperScheduler/src/test/resources/apk/v.0.0.2.apk");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        session = new SessionHelper(driver);
        helperBase = new HelperBase(driver);
        eventsPage = new EventsPage(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void stop() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
