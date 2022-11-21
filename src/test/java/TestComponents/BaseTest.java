package TestComponents;

import PageObjects.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    public static WebDriver driver;
    public static Login login;

    public static WebDriver InitializeDriver() throws IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("/home/meghav/applications/SeleniumWithFramework/src/main/java/framework/resources/GlobalData.properties");
        properties.load(fis);
        String browserName = properties.getProperty("browser");
        if(browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        else if (browserName.equalsIgnoreCase("firefox")){
            //firefox

        }
        else if (browserName.equalsIgnoreCase("edge")){
            //edge
            System.setProperty("webdriver.edge.driver", "edge.exe");
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }

    @BeforeMethod
    public static Login AmazonApplication() throws IOException {
        driver = InitializeDriver();
        login = new Login(driver);
        login.OpenApplication();
        return login;
    }

}
