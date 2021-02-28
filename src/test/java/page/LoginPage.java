package page;


import com.test.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static constants.LoginPageConstant.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    public void gittiGidiyorLogin()
    {
        Assert.assertEquals(homeTitle,getDriver().getTitle());
        hoverElement(SIGN);
        clickElement(SIGN_IN_HOME_PAGE);
        Assert.assertEquals(loginTitle,getDriver().getTitle());
        findElement(USER_NAME).clear();
        sendKeys(USER_NAME,userName);
        findElement(PASSWORD).clear();
        sendKeys(PASSWORD,password);
        clickElement(SIGN_IN_BUTTON);
        Assert.assertEquals(homeTitle,getDriver().getTitle());
        System.out.println("Giriş Başarılı.");
    }
}
