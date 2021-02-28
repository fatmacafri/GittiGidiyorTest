package test;

import base.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.SearchPage;

public class SearchPageTest extends BaseTest {

    SearchPage searchPage;
    @Before
    public void beforeTest()
    {
        searchPage =new SearchPage(getDriver());
        getDriver().navigate().to("https://www.gittigidiyor.com");
    }
    @Test
    public void gittiGidiyorSearchTest()
    {
        searchPage.gittiGidiyorSearch();
        searchPage.secondPage();
    }
    @After
    public void afterTest()
    {
        getDriver().quit();
    }




}
