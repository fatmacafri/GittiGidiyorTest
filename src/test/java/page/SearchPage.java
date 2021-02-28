package page;

import com.test.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.SearchPageConstant.*;

public class SearchPage extends BasePage {


    public SearchPage(WebDriver driver)
    {
        super(driver);
    }
    public void gittiGidiyorSearch()
    {
        hoverElement(SEARCH);
        clickElement(SEARCH);
        System.out.println("Arama Kutusuna Tıklanıldı.");
        sendKeys(SEARCH_TEXT,text);
        System.out.println("Arama Kutusuna Aranılacak Kelime Yazıldı.");
        clickElement(SEARCH_BUTTON);
        System.out.println("Arama Butonuna Tıklanıldı ve Sonuçlar Açıldı.");

    }
    public void secondPage()
    {
        WebElement element = getDriver().findElement(PAGINATION);
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);",element);
        element.click();
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
        //getDriver().navigate().to("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
    }


}
