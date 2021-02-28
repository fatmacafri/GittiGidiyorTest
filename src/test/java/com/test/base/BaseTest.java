package com.test.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        setDriver(new ChromeDriver());
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        getDriver().manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown()
    {
        getDriver().quit();
    }
    public WebDriver getDriver()
    {
        return driver;
    }
    public void setDriver(WebDriver driver)
    {
        this.driver=driver;
    }
}
