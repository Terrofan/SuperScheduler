package com.telran.scheduler.tests;

import com.telran.scheduler.manager.EventsPage;
import com.telran.scheduler.manager.HelperBase;
import com.telran.scheduler.models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    public void TestLogin() throws Exception {
        app.getSession().fillLogInForm(new User().setUserName("sh_nik_93@mail.ru").setPassword("Ab123456"));
        app.getSession().tapLoginButton();
        Thread.sleep(5000);
        Assert.assertTrue(app.getEventsPage().isPlusButtonPresent());
    }
}
