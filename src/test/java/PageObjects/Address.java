package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Address {
    WebDriver driver;

    public Address(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nav-logo-sprites")
    WebElement logo;

    @FindBy(id = "nav-link-accountList")
    WebElement account;

    @FindBy(css = "[data-card-identifier='AddressesAnd1Click']")
    WebElement yourAddresses;

    @FindBy(css = "[class='a-box first-desktop-address-tile']")
    WebElement addAddress;

    @FindBy(css = "[id='address-ui-widgets-countryCode-dropdown-nativeId']")
    WebElement selectCountry;

    @FindBy(id = "address-ui-widgets-enterAddressFullName")
    WebElement fullName;

    @FindBy(id = "address-ui-widgets-enterAddressPhoneNumber")
    WebElement phoneNumber;

    @FindBy(id = "address-ui-widgets-enterAddressPostalCode")
    WebElement postalCode;

    @FindBy(id = "address-ui-widgets-enterAddressLine1")
    WebElement address1;

    @FindBy(id = "address-ui-widgets-enterAddressLine2")
    WebElement address2;

    @FindBy(id = "address-ui-widgets-landmark")
    WebElement landMark;

    @FindBy(id = "address-ui-widgets-enterAddressCity")
    WebElement addressCity;

    @FindBy(id = "address-ui-widgets-use-as-my-default")
    WebElement defaultCheck;

    @FindBy(css = "#address-ui-widgets-form-submit-button > .a-button-inner > .a-button-input")
    WebElement subimt;

    public Payment AddingAddress(String countyName, String name, String contact, String picode, String addres1,String addres2, String landmark, String city){
        account.click();
        yourAddresses.click();
        addAddress.click();
        Select country = new Select(selectCountry);
        country.selectByVisibleText(countyName);
        fullName.sendKeys(name);
        phoneNumber.sendKeys(contact);
        postalCode.clear();
        postalCode.sendKeys(picode);
        address1.sendKeys(addres1);
        address2.sendKeys(addres2);
        landMark.sendKeys(landmark);
        addressCity.clear();
        addressCity.sendKeys(city);
        defaultCheck.click();
        subimt.click();
        logo.click();
        Payment payment = new Payment(driver);
        return payment;


    }



}
