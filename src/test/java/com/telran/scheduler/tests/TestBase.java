package com.telran.scheduler.tests;

import com.telran.scheduler.manager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

public class TestBase {

    public static ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() throws MalformedURLException {
        app.init();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        app.stop();
    }

}
