package PageObjects;

import AbstractComponents.AbstactComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.lang.System.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.System.out;

public class TodaysDeals extends AbstactComponents{
    WebDriver driver;


    public TodaysDeals(WebDriver driver){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//a[@href='/deals?ref_=nav_cs_gb']")
    WebElement deals;

    @FindBy(css = "div.a-row.Grid-module__gridSection_1SEJTeTsU88s6aVeuuekAp div div:nth-child(3) div div")
    WebElement thirdDeals;

    By products = By.xpath("//a[@href='/deals?ref_=nav_cs_gb']");

    public SearchMobiles Deals() throws InterruptedException {
        waits(driver.findElement(products));
//        waits(products);
        Thread.sleep(10000);
        deals.click();
        thirdDeals.click();
        SearchMobiles searchMobiles = new SearchMobiles(driver);
        out.println();
        out.println("");
        return searchMobiles;


    }

}
