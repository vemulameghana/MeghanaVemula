package PageObjects;

import AbstractComponents.AbstactComponents;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class SearchMobiles extends AbstactComponents {
    WebDriver driver;
    public SearchMobiles(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchbar;

    @FindBy(id = "nav-search-submit-button")
    WebElement search;

    @FindBy(css = "div[class*=s-matching-dir]>div > span:nth-child(2)>div[class*=s-main-slot] > div:nth-child(10)>div>div>div>div>div>div>div>div>div>div:nth-child(2)>div")
    WebElement Lastmobile;

    @FindBy(id = "add-to-cart-button")
    WebElement addToCart;

    public void Search(String searchtext){
        searchbar.sendKeys(searchtext);
        search.click();
    }

    public void Scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,4000)");
    }

    public Orders LastMobile() {
        Lastmobile.click();
//        Set<String> window = driver.getWindowHandles();
//        Iterator<String> it= window.iterator();
//        String parentId = it.next();
//        String childId = it.next();
//        driver.switchTo().window(childId);
//        addToCart.click();
//        driver.switchTo().window(parentId);
        Orders order = new Orders(driver);
        return order;
    }

}
