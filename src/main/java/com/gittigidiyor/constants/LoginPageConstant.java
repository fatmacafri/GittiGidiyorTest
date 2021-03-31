package com.gittigidiyor.constants;

import org.openqa.selenium.By;

public class LoginPageConstant
{
    public static String homeTitle="GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi",
            loginTitle="Üye Girişi - GittiGidiyor",userName="ffatmacafri",password="12345a";


    public static final By USER_NAME=By.id("L-UserNameField");
    public static final By PASSWORD=By.id("L-PasswordField");
    public static final By SIGN_IN_BUTTON=By.id("gg-login-enter");
    public static final By SIGN_AREA=By.cssSelector("div[data-cy='header-user-menu']");
    public static final By SIGN_HOVER=By.cssSelector("div>a[data-cy='header-login-button']");
}
