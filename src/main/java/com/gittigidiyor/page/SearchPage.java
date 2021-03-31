package com.gittigidiyor.page;

import com.gittigidiyor.base.BasePage;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.gittigidiyor.constants.SearchPageConstant.*;

public class SearchPage extends BasePage {


    public SearchPage(WebDriver driver)
    {
        super(driver);
    }
    final static Logger logger = Logger.getLogger((SearchPage.class));

    public SearchPage gittiGidiyorSearch()
    {
        hoverElement(SEARCH);
        clickElement(SEARCH);
        //logger.info("Arama Kutusuna Tıklanıldı.");
        sendKeys(SEARCH_TEXT,text);
        //logger.info("Aranılanılacak Kelime : "+text);
        clickElement(SEARCH_BUTTON);
        //logger.info("Arama Yapıldı Sonuçlar Gösteriliyor.");

        return this;
    }
    public SearchPage secondPage()
    {

        WebElement element = getDriver().findElement(PAGINATION);
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);",element);

        element.click();
        //logger.info("Arama Sonuçları Sayfasından 2.Sayfa Açılıyor.");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
        logger.info("2.Sayfanın Açıldığı Kontrol Edildi.");
        //getDriver().navigate().to("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");

        return this;
    }
}
