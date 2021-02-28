package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,300);
    }
    public WebElement findElement(By by)
    {
        untilElementAppear(by);
        return driver.findElement(by);
    }
    public void clickElement(By by)
    {
        untilElementClickable(by);
        findElement(by).click();
    }
    public void sendKeys(By by,String text)
    {
        findElement(by).sendKeys(text);
    }
    public void hoverElement(By by)
    {
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }
    public void untilElementClickable(By by)
    {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
    }
    public void untilElementAppear(By by)
    {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
    }
    public WebDriver getDriver()
    {
        return driver;
    }

}
