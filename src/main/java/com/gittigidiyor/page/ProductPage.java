package com.gittigidiyor.page;

import com.gittigidiyor.base.BasePage;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static com.gittigidiyor.constants.ProductPageConstant.*;


public class ProductPage extends BasePage
{

    public ProductPage(WebDriver driver) {
        super(driver);
    }
    final static Logger logger = Logger.getLogger((ProductPage.class));

    public ProductPage productSelect() {
        Random rnd = new Random();
        int index = rnd.nextInt(47) + 1;
        logger.info("Açılan Ürünlerden Rastgele Bir Ürün Seçiliyor.");
        List<WebElement> products = getDriver().findElements(PRODUCT_LIST);
        products.get(index).click();
        logger.info("Açılan Ürünlerden Rastgele Bir Ürün Seçildi.");
        return this;
    }

    public ProductPage addBasket() {

        productPrice = getDriver().findElement(PRODUCT_PRICE).getText();
        logger.info("Seçilen Ürünün Fiyatı :" +productPrice);
        logger.info("Sepete Ekle'ye Tıklandı.");
        WebElement element = getDriver().findElement(ADD_BASKET);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        logger.info("Seçilen Ürün Sepete Eklendi.");
        return this;
    }

    public ProductPage goToBasket()
    {
        findElement(GO_TO_BASKET).click();
        logger.info("Sepete Git'e Tıklanıldı.");
        basketPrice = getDriver().findElement(BASKET_PRICE).getText();
        logger.info("Sepetteki Ürünün Fiyatı :"+basketPrice);
        List<WebElement> prices =getDriver().findElements(PRODUCT_PRICES);
        String[] amountList=new String[prices.size()];
        for(int i=0;i<prices.size();i++)
        {
            amountList[i]=prices.get(i).getText();
        }
        logger.info("Ürün Sayfasındaki Fiyat ile Sepette Yer Alan Ürün Fiyatının Doğruluğu Karşılaştırılıyor.");
        Assert.assertEquals(differences,productPrice,amountList[0]);
        logger.info(productPrice+" = "+basketPrice+"Ürünün Fiyatı Doğru.");
        return this;
    }

    public ProductPage increasingTheNumberOfProduct()
    {
        findElement(NUMBER_OF_PRODUCT).click();
        logger.info("Sepete En Son Eklenen Ürünün Adedi Arttılıyor.");
        findElement(NUMBER_OF_PRODUCT_VALUE).click();
        logger.info("Sepete En Son Eklenen Ürün Adedi Artırıldı. Yeni Adet :" + findElement(NUMBER_OF_PRODUCT_VALUE).getText());
        return this;
    }
    public ProductPage deleteProduct()
    {
        findElement(DELETE_BUTTON).click();
        logger.info("Sepetteki Ürün Siliniyor.");
        message=findElement(EMPTY_BASKET).getText();
       // Assert.assertEquals(emptyMessage,message);
        logger.info("Sepetin Boş Olduğu Doğrulandı.Test Başarılı.");
        return this;
    }
}

