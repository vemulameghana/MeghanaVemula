package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Assignment {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/meghav/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email")).sendKeys("meghana.vemula@zemosolabs.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("meghana@789");
        driver.findElement(By.id("signInSubmit")).click();
        driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[aria-label='Shop collections']")));
        driver.findElement(By.cssSelector("div.a-row.Grid-module__gridSection_1SEJTeTsU88s6aVeuuekAp div div:nth-child(3) div div")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
        driver.findElement(By.id("nav-search-submit-button")).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.cssSelector("div[class*=s-matching-dir]>div > span:nth-child(2)>div[class*=s-main-slot] > div:nth-child(15)>div>div>div>div>div>div>div>div>div>div:nth-child(2)>div")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String>it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.switchTo().window(parentId);
        js.executeScript("window.scrollBy(0, 0)");
        driver.findElement(By.id("nav-logo-sprites")).click();
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("nav-orders")).click();
        WebElement orders = driver.findElement(By.id("time-filter"));
        Select dropdown = new Select(orders);
        dropdown.selectByIndex(2);
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.cssSelector("[data-card-identifier='AddressesAnd1Click']")).click();
        driver.findElement(By.cssSelector("[class='a-box first-desktop-address-tile']")).click();
        WebElement countriesList = driver.findElement(By.cssSelector("[id='address-ui-widgets-countryCode-dropdown-nativeId']"));
        Select country = new Select(countriesList);
        country.selectByVisibleText("India");
        driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Meghana");
        driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("9876543210");
        driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).clear();
        driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("505001");
        driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("H.No: 11-7/8");
        driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).click();
        driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("Ramnagar");
        driver.findElement(By.id("address-ui-widgets-landmark")).sendKeys("chowrastha");
        driver.findElement(By.id("address-ui-widgets-enterAddressCity")).clear();
        driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("karimnagar");
//        WebElement statesList = driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId"));
//        Select state = new Select(statesList);
//        state.selectByVisibleText("TELANGANA");
        driver.findElement(By.id("address-ui-widgets-use-as-my-default")).click();
//        WebElement addressType = driver.findElement(By.cssSelector("[id=address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId]"));
//        Select address = new Select(addressType);
//        address.selectByIndex(0);
        driver.findElement(By.cssSelector("#address-ui-widgets-form-submit-button > .a-button-inner > .a-button-input")).click();
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.cssSelector("[data-card-identifier='Prime']")).click();
        System.out.println(driver.findElement(By.className("mcx-profile__info")).getText());









//        id="address-ui-widgets-enterAddressFullName"


//        driver.findEleme        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("attach-sidesheet-view-cart-button-announce")));
//        driver.findElement(By.id("attach-sidesheet-view-cart-button")).click();nt(By.cssSelector("[class='a-native-dropdown a-declarative sc-update-quantity-select']")).click();

//        WebElement staticDropdown = driver.findElement(By.className("a-button.a-button-dropdown.quantity"));
//        Select dropdown = new Select(staticDropdown);
//        dropdown.selectByIndex(1);
//        .a-button.a-button-dropdown.quantity
//div[class*='s-main-slot s-result-list s-search-results sg-row']> div[class*='s-result-item']:nth-child(20)
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("[class*='Grid-module']:first-child")));
//        Thread.sleep(10000);
//        driver.findElement(By.className("[data-testid='grid-deals-container']:nth-child(3)")).click();



//
//

    }
}
