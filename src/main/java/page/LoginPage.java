package page;


import base.BasePage;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static constants.LoginPageConstant.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    final static Logger logger = Logger.getLogger((LoginPage.class));
    public void gittiGidiyorLogin()
    {
        logger.info("Test Edilecek Site Açıldı.");
        Assert.assertEquals(homeTitle,getDriver().getTitle());
        logger.info("Ana Sayfanın Açıldığı Kontrol Edildi. ");
        hoverElement(SIGN);
        clickElement(SIGN_IN_HOME_PAGE);
        logger.info("Login Sayfası Açıldı.");
        Assert.assertEquals(loginTitle,getDriver().getTitle());
        logger.info("Açılan Sayfanın Login Sayfası Olduğu Kontrol Edildi.");
        findElement(USER_NAME).clear();
        sendKeys(USER_NAME,userName);
        findElement(PASSWORD).clear();
        sendKeys(PASSWORD,password);
        clickElement(SIGN_IN_BUTTON);
        logger.info("Login İşlemi Gerçekleşti.");
        logger.error("Giriş Yapılamadı.");
        Assert.assertEquals(homeTitle,getDriver().getTitle());
        logger.info("Ana Sayfaya Yönlendirilme Kontrol Edildi.");
    }
}
