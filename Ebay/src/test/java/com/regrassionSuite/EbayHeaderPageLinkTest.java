package com.regrassionSuite;


import com.regrassion.EbayHeaderPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageBase.PageBase;

public class EbayHeaderPageLinkTest extends PageBase {


    private Object EbayHeaderPage;

    @BeforeMethod
    public void init(){
        EbayHeaderPage= PageFactory.initElements ( driver,EbayHeaderPage.class );
    }


    @Test
        public void motorsLinkPageTest() {
          clickOnElement ( " motors" );
        }

        @Test
        public void savedLinkTest() {
            clickOnElement ( "saved" );
            }


        @Test
        public void electronicsLinkTest() {

        clickOnElement ( "electronics" );
        }

        @Test
        public void collectiblesArtLinkTest() {
           clickOnElement ( "collectiblesArt" );
        }

        @Test
        public void homeGardenLinkTest() {
            clickOnElement ( "homeGarden" );
        }

        @Test
        public void sportingGoodsLinkTest() {
            clickOnElement ( "sportingGoods" );
        }

        @Test
        public void toysLinkTest() {
           clickOnElement ( "toysLink" );
        }

        @Test
        public void businessIndustrialLinkTest() {
           clickOnElement ( "businessIndustrial" );
        }

        @Test
        public void musicLinkLinkTest() {
            clickOnElement ( "musicLink" );
        }

        @Test
        public void dealsLinkTest() {
            clickOnElement ( "dealsLink" );
        }


        @Test
        public void  myEbayLinkTest() {
            clickOnElement ( " myEbay" );
        }


        @Test
        public void myEbayLink() {
            clickOnElement ( "dm" );
        }
    }






