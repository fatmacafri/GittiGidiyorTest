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
        Assert.assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi",getDriver().getTitle());
        hoverElement(SIGN);
        clickElement(SIGN_IN_HOME_PAGE);
        Assert.assertEquals("Üye Girişi - GittiGidiyor",getDriver().getTitle());
        findElement(USER_NAME).clear();
        sendKeys(USER_NAME,"ffatmacafri");
        findElement(PASSWORD).clear();
        sendKeys(PASSWORD,"142296Fc.");
        clickElement(SIGN_IN_BUTTON);
        Assert.assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi",getDriver().getTitle());
        System.out.println("Giriş Başarılı.");
    }
}
