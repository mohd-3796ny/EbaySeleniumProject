package com.regrassion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayFooterPage {

    @FindBy(className = "/html/body/div[2]/header/div[1]/ul[1]/li[2]/a")
    private WebElement dailyDeals;

@FindBy(xpath = "/html/body/header/div[1]/ul[1]/li[3]/a")
    private WebElement giftCards;

@FindBy(xpath = "/html/body/div[2]/header/div[1]/ul[1]/li[4]/a")
    private WebElement helpContuct;

@FindBy(xpath = "/html/body/div[2]/header/div[1]/ul[2]/li[1]/a")
    private WebElement sell;

@FindBy(xpath = "/html/body/div[2]/header/div[1]/ul[2]/li[2]/div/a[1]")
    private WebElement myEbay;

@FindBy(xpath = "//*[@id=\"gh-Alerts-i\"]")
    private WebElement notification;

@FindBy(xpath = "//*[@id=\"gh-cart-i\"]")
    private WebElement addTheCart;



  public void clickOnDailyDeals() {
   dailyDeals.click ();

    }

    public void clickOnGiftCards() {

     giftCards.click ();
    }

    public void clickOnHelpContuct() {

        helpContuct.click ();
    }

    public void clickOnSell() {

        sell.click ();
    }

    public void clickOnMyEbay() {

        myEbay.click ();
    }
    public void clicOnNotification() {

        notification.click ();
    }

   public void clickOnAddTheCart() {
      addTheCart.click ();
    }


}
