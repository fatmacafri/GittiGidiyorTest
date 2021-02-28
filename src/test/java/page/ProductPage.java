package page;

import com.test.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static constants.ProductPageConstant.*;


public class ProductPage extends BasePage
{

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    String productPrice, basketPrice,message;

    public void productSelect() {
        Random rnd = new Random();
        int index = rnd.nextInt(47) + 1;
        List<WebElement> products = getDriver().findElements(PRODUCT_LIST);
        products.get(index).click();
    }

    public void addBasket() {
        productPrice = getDriver().findElement(PRODUCT_PRICE).getText();
        WebElement element = getDriver().findElement(ADD_BASKET);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    public void goToBasket()
    {
        findElement(GO_TO_BASKET).click();
        basketPrice = getDriver().findElement(BASKET_PRICE).getText();
        List<WebElement> prices =getDriver().findElements(By.xpath("//*[@class='total-price']"));
        String[] amountList=new String[prices.size()];
        for(int i=0;i<prices.size();i++)
        {
            amountList[i]=prices.get(i).getText();
        }
        Assert.assertEquals("ÜRÜN FİYATLARI FARKLIDIR.",productPrice,amountList[0]);
    }

    public void increasingTheNumberOfProduct()
    {
        findElement(NUMBER_OF_PRODUCT).click();
        findElement(By.xpath("//*[@class='amount']//*[@value='2']")).click();
    }
    public void deleteProduct()
    {
        findElement(DELETE_BUTTON).click();
        message=findElement(EMPTY_BASKET).getText();
        Assert.assertEquals("Sepetinizde ürün bulunmamaktadır.",message);
    }
}

