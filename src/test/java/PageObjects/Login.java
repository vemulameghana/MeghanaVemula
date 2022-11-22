package PageObjects;

import AbstractComponents.AbstactComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends AbstactComponents {
    //local object
    WebDriver driver;

    public Login(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="nav-link-accountList")
    WebElement signin;

    @FindBy(id="ap_email")
    WebElement userEmail;

    @FindBy(id="continue")
    WebElement emailContinue;

    @FindBy(id="ap_password")
    WebElement loginpassword;

    @FindBy(id="signInSubmit")
    WebElement submit;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    WebElement loginName;

    public void OpenApplication(){
        driver.get("https://www.amazon.in/");

    }

    By products = By.id("ap_password");

    public TodaysDeals LoginApplication(String email, String password){
        signin.click();
        userEmail.sendKeys(email);
        emailContinue.click();
        waits(driver.findElement(products));
        loginpassword.sendKeys(password);
        submit.click();
        TodaysDeals todaysDeals = new TodaysDeals(driver);
        return todaysDeals;
    }
    public WebElement LoginName(){
        return loginName;
    }
//   Assert.assertEquals(loginName.getText(), "Hello, meghana");

}
