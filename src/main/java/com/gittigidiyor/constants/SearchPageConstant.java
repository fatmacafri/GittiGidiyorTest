package com.gittigidiyor.constants;

import org.openqa.selenium.By;

public class SearchPageConstant
{
    public static String text="bilgisayar", url="https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2";


    public static final By SEARCH =By.cssSelector("form>div>div[class='sc-1yew439-3 dkiUfE']");
    public static final By SEARCH_TEXT=By.name("k");
    public static final By SEARCH_BUTTON=By.cssSelector("div>button[data-cy='search-find-button']");
    public static final By PAGINATION =By.cssSelector("div.pager>ul>li:nth-of-type(2)>a");

}
