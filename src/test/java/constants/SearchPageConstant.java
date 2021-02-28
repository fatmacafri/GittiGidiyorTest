package constants;

import org.openqa.selenium.By;

public class SearchPageConstant
{
    public static final By SEARCH =By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form");
    public static final By SEARCH_TEXT=By.name("k");
    public static final By SEARCH_BUTTON=By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button");
    public static final By PAGINATION =By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a");
}
