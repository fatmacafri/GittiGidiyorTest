package test;

import base.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.ProductPage;

public class ProductPageTest extends BaseTest
{
    ProductPage productPage;
    @Before
    public void beforeTest()
    {
        productPage =new ProductPage(getDriver());
        getDriver().navigate().to("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
    }

    @Test
    public void gittiGidiyorProductTest()
    {
        productPage.productSelect();
        productPage.addBasket();
        productPage.goToBasket();
        productPage.increasingTheNumberOfProduct();;
        productPage.deleteProduct();
    }

    @After
    public void afterTest()
    {
        getDriver().quit();
    }
}
