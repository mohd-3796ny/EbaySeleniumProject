package com.regrassionSuite;

import com.regrassion.EbayShopByCatagoryPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageBase.PageBase;

public class EbayShopByCatagoryPageTest extends PageBase {

    private Object EbayShopByCatagoryPage;

    @BeforeMethod
    public void initializationOfElements() {
        EbayShopByCatagoryPage  = PageFactory.initElements ( driver ,EbayShopByCatagoryPage.class );
    }


    @Test
    public void contactUsLinkTest() {
        EbayContactUsPage objOfShopByCatagory = null;
        objOfShopByCatagory.contactUs();
        Assert.assertTrue(objOfShopByCatagory.getVerifySubmitButton().isDisplayed());

    }


    @Test
    public void entertainmentMemorabiliaTest() {
        EbayContactUsPage objOfEntertainmentMemorabilia = null;
        objOfEntertainmentMemorabilia.contactUs();
        Assert.assertTrue(objOfEntertainmentMemorabilia.getVerifySubmitButton().isDisplayed());

    }

    @Test
    public void sportingGoodsTest() {
        EbayContactUsPage objOfSportingGoods = null;
        objOfSportingGoods.contactUs();
        Assert.assertTrue(objOfSportingGoods.getVerifySubmitButton().isDisplayed());

    }


    @Test
    public void toys_hobbies() {
        EbayContactUsPage objOfToys_hobbies = null;
        objOfToys_hobbies.contactUs();
        Assert.assertTrue(objOfToys_hobbies.getVerifySubmitButton().isDisplayed());

    }


    @AfterTest
    public void TearDown(){
        driver.quit ();
    }

}



