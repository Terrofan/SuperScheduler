package com.telran.scheduler.manager;

import com.telran.scheduler.models.User;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SessionHelper extends HelperBase{


    public SessionHelper(AppiumDriver driver) {
        super(driver);
    }

    public void fillLogInForm(User user) throws Exception {
        //Thread.sleep(5000);
        type(By.id("log_email_input"), user.getUserName()); //fill the "login" field
        type(By.id("log_password_input"), user.getPassword()); //fill the "password" field
    }

    public void tapLoginButton()
    {
        tap(By.id("login_btn")); // tap on the ConfirmLogin button
    }
}
