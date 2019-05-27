package com.regrassionSuite;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageBase.PageBase;

public class EbayAllCatagoryPageTest extends PageBase {

    private EbayContactUsPage objOfAllCatagoryPage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfAllCatagoryPage = PageFactory.initElements(driver, EbayContactUsPage.class);
    }


    @Test
    public void AllCatagoryPageTest() {
       clickOnElement ( "AllCatagoryPage" );

    }

@Test
public void AntiqueDropDownTest(){
    clickOnElement ("antique");
}
@AfterTest
    public void TearDown(){
        driver.quit ();
}

}
