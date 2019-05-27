package com.regrassionSuite;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageBase.PageBase;

public class EbayContuctUsPageTest extends PageBase {


    private EbayContactUsPage objOfContactUsPage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfContactUsPage = PageFactory.initElements(driver, EbayContactUsPage.class);
    }


    @Test
    public void contactUsLinkTest() {
        objOfContactUsPage.contactUs();
        Assert.assertTrue(objOfContactUsPage.getVerifySubmitButton().isDisplayed());

    }

@AfterTest
    public void TearDown(){
        driver.quit ();
}

}
