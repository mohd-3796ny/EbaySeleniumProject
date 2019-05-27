package com.regrassion;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageBase.PageBase;

public class EbayContuctUsPage extends PageBase {

@FindBy(xpath = "//*[@id=\"search_input_element\"]")
    private WebElement helpTextBox;

    public void clickOnhelpTextBox(){
        helpTextBox.click ();

    }

}
