package com.regrassion;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageBase.PageBase;



public class EbayShopByCatagoryPage extends PageBase {

   @FindBy(id="gh-shop-a")
         WebElement shopByCatagory;

   @FindBy(xpath = "//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[3]/a")
         WebElement entertainmentMemorabilia;

   @FindBy(xpath = "//*[@id=\"gh-sbc\"]/tbody/tr/td[3]/h3[1]/a")
        WebElement sportingGoods;


   @FindBy(xpath = "//*[@id=\"gh-sbc\"]/tbody/tr/td[3]/h3[2]/a")
        WebElement toys_hobbies;


           public void clickOnshopByCatagory(){
           shopByCatagory.click ();

    }



    public void clickOnEntertainmentMemorabilia(){
        entertainmentMemorabilia.click ();

    }

    public void clickOnSportingGoods(){
        sportingGoods.click ();

    }
    public void clickOnToys_hobbies(){
               toys_hobbies.click ();
    }

}
