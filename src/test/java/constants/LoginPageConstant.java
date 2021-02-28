package constants;

import org.openqa.selenium.By;

public class LoginPageConstant
{
    public static String homeTitle="GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi",
            loginTitle="Üye Girişi - GittiGidiyor",userName="ffatmacafri",password="*******";
    public static final By USER_NAME=By.id("L-UserNameField");
    public static final By PASSWORD=By.id("L-PasswordField");
    public static  final By SIGN_IN_BUTTON=By.id("gg-login-enter");
    public static final By SIGN=By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]");
    public static final By SIGN_IN_HOME_PAGE=By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/div/a");
}
