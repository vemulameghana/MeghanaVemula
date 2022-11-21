package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Orders {
    WebDriver driver;

    public Orders(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nav-logo-sprites")
    WebElement logo;

    @FindBy(id = "nav-link-accountList")
    WebElement account;

    @FindBy(id = "nav-orders")
    WebElement allOrders;

    @FindBy(id = "time-filter")
    WebElement orders;



    public Address ordersList(){
        logo.click();
        account.click();
        allOrders.click();
        Select dropdown = new Select(orders);
        dropdown.selectByIndex(2);
        Address address = new Address(driver);
        return address;
    }
}
