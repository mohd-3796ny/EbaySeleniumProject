package com.regrassion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageBase.PageBase;

public class EbayAllCatagoryPage extends PageBase {

@FindBy(id = "gh-cat")
    WebElement allCatagory;

@FindBy(xpath = "//*[@id=\"gh-cat\"]")
     WebElement  baby_dropDownn;


    public void clickOnallCatagory(){
        allCatagory.click ();

    }
public void baby_dropDownn(){
    baby_dropDownn.click ();
}

}
