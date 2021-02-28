package constants;

import org.openqa.selenium.By;

public class ProductPageConstant
{

    public static String productPrice, basketPrice,message,
            differences="ÜRÜN FİYATLARI FARKLIDIR.",emptyMessage="Sepetinizde ürün bulunmamaktadır.";
    public static final By ADD_BASKET=By.xpath("//*[@id=\"add-to-basket\"]");
    public static final By PRODUCT_LIST=By.cssSelector("#best-match-right > div.blueWrapper.clearfix > div.clearfix > ul > li");
    public static final By PRODUCT_PRICE=By.xpath("//*[@class='lowPrice                                                            lastPrice']");
    public static final By GO_TO_BASKET=By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]");
    public static final By BASKET_PRICE=By.xpath("//*[@class='total-price']");
    public static final By NUMBER_OF_PRODUCT=By.xpath("//*[@class='amount']");
    public static final By DELETE_BUTTON=By.xpath("//*[@class='btn-delete btn-update-item hidden-m']");
    public static final By EMPTY_BASKET=By.xpath("//*[@class='gg-w-22 gg-d-22 gg-t-21 gg-m-18']/h2");
    public static final By NUMBER_OF_PRODUCT_VALUE=By.xpath("//*[@class='amount']//*[@value='2']");
    public static final By PRODUCT_PRICES=By.xpath("//*[@class='total-price']");
}
