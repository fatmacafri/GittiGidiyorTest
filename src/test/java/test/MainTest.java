package test;

import com.test.base.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.LoginPage;
import page.ProductPage;
import page.SearchPage;

public class MainTest extends BaseTest
{
    LoginPage loginPage;
    SearchPage searchPage;
    ProductPage productPage;
    @Before
    public void beforeTest()
    {
        loginPage =new LoginPage(getDriver());
        searchPage=new SearchPage(getDriver());
        productPage=new ProductPage(getDriver());
        getDriver().navigate().to("https://www.gittigidiyor.com");
    }
    @Test
    public void mainTest()
    {
        loginPage.gittiGidiyorLogin();
        searchPage.gittiGidiyorSearch();
        searchPage.secondPage();
        productPage.productSelect();
        productPage.addBasket();
        productPage.goToBasket();
        productPage.increasingTheNumberOfProduct();
        productPage.deleteProduct();
    }
    @After
    public void afterTest()
    {
        getDriver().quit();
    }
}
