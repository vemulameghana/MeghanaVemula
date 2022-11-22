package Test;

import PageObjects.*;
import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonAssignment extends BaseTest {

    @Test
    public void Amazon() throws InterruptedException {
        TodaysDeals todaysDeals = login.LoginApplication("meghana.vemula@zemosolabs.com", "Gunni@789");
        SearchMobiles searchMobiles = todaysDeals.Deals();
        searchMobiles.Search("Mobiles");
        searchMobiles.Scroll();
        Orders order = searchMobiles.LastMobile();
        Address address = order.ordersList();
        Payment payment = address.AddingAddress("India", "Meghana", "9876543210", "505001", "1-7", "Ramnagar", "chowrasta", "Karimnagar");
        String confirmationMessage = payment.paymentVerify();
        Assert.assertEquals(confirmationMessage, "As per new RBI guidelines, some of your saved cards may be removed. Please re-enter card details and save it.Learn more");

    }
}
