package com.gittigidiyor.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        setDriver(new ChromeDriver(options));
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        getDriver().navigate().to("https://www.gittigidiyor.com");
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
