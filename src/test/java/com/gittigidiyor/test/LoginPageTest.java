package com.gittigidiyor.test;

import com.gittigidiyor.base.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.gittigidiyor.page.LoginPage;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;

    @Before
    public void beforeTest() {
        loginPage =new LoginPage(getDriver());
    }

    @Test
    public void gittiGidiyorLoginTest() {
        loginPage.gittiGidiyorLogin();
    }

    @After
    public void afterTest()
    {
        getDriver().quit();
    }
}
