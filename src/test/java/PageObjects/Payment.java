package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {

    WebDriver driver;

    public Payment(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nav-link-accountList")
    WebElement account;

    @FindBy(xpath = "//div[@data-card-identifier='PaymentOptions']")
    WebElement payment;

    @FindBy(css = "div[class='a-alert-content']>span[class='important-message-box-message-group-item']")
    WebElement paymentText;

    public String paymentVerify(){
        account.click();
        payment.click();
        return paymentText.getText();
    }

}
