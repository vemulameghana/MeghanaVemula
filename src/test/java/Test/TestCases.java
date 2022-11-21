package Test;

import PageObjects.*;
import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCases extends BaseTest {

    @Test
    public void LoginToApplication() throws IOException, InterruptedException {
//        Login login = AmazonApplication();
        login.LoginApplication("meghana.v@zemosolabs.com", "meghana@789");
//        [class="a-alert-content"]:nth-child(3)
    }

    @Test(dependsOnMethods = {"LoginToApplication"})
    public void TodaysDeals() throws InterruptedException {
        TodaysDeals todaysDeals = login.LoginApplication("meghana.vemula@zemosolabs.com", "meghana@789");
        todaysDeals.Deals();
    }

}
