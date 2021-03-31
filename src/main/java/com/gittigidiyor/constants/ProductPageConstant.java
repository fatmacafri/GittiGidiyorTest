package com.gittigidiyor.constants;

import org.openqa.selenium.By;

public class ProductPageConstant
{

    public static String productPrice, basketPrice,message,
            differences="ÜRÜN FİYATLARI FARKLIDIR.",emptyMessage="Sepetinize Geçici Olarak Ulaşılamıyor";


    public static final By ADD_BASKET=By.id("add-to-basket");
    public static final By PRODUCT_LIST=By.cssSelector("#best-match-right > div.blueWrapper.clearfix > div.clearfix > ul > li");
    public static final By PRODUCT_PRICE=By.id("sp-price-lowPrice");
    public static final By GO_TO_BASKET=By.cssSelector("div.basket-container>a");
    public static final By BASKET_PRICE=By.xpath("//*[@class='total-price']");
    public static final By NUMBER_OF_PRODUCT=By.xpath("//*[@class='amount']");
    public static final By DELETE_BUTTON=By.cssSelector("div>div>a.btn-delete>i.gg-icon");
    public static final By EMPTY_BASKET=By.cssSelector("div.empty-cart-info>div:nth-of-type(2)>h2");
    public static final By NUMBER_OF_PRODUCT_VALUE=By.xpath("//*[@class='amount']//*[@value='2']");
    public static final By PRODUCT_PRICES=By.xpath("//*[@class='total-price']");
}
