package com.regrassionSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageBase.PageBase;

public class EbayFooterPageLinksTest extends PageBase {




    @BeforeMethod
    public void initializationOfElements() {
        driver.getPageSource (  );
    }

    @Test
    public void dailyDealsLinkTest() {
        clickOnElement ("dailyDeals"  );

    }

    @Test
    public void giftCardsLinkTest(){
        clickOnElement ("giftCards");
    }

        @Test
        public void helpContuctTests() {
            clickOnElement ("helpContuct");
        }

        @Test
        public void ebaySellLinkTest() {
            clickOnElement ("sell");
        }

        @Test
        public void myEbayLinkTest() {
            clickOnElement ("myEbay");
        }

        @Test
        public void notificationLinkTest() {
            clickOnElement ("notification");
        }

        @Test
        public void addTheCartLinkTest() {
            clickOnElement ("addTheCart");
        }

        @AfterTest
    public void TearDown(){
        driver.quit ();
        }
    }



