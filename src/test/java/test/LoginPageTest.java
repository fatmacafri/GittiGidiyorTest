package test;

import base.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.LoginPage;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;
    @Before
    public void beforeTest()
    {
        loginPage =new LoginPage(getDriver());
        getDriver().navigate().to("https://www.gittigidiyor.com");
    }

    @Test
    public void gittiGidiyorLoginTest()
    {
        loginPage.gittiGidiyorLogin();
    }

    @After
    public void afterTest()
    {
        getDriver().quit();
    }
}
