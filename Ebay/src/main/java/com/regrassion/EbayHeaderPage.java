package com.regrassion;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pageBase.PageBase;
import java.util.List;

public class EbayHeaderPage extends PageBase {

    @FindBy(partialLinkText= "motors")
    private WebElement motors;

    @FindBy(partialLinkText = "fashion")
    private WebElement fashion;

    @FindBy(partialLinkText = "electronics")
    private WebElement electronics;

    @FindBy(partialLinkText = "collectiblesArt")
    private WebElement collectiblesArt;

    @FindBy(partialLinkText = "homeGarden")
    private WebElement homeGarden;

    @FindBy(partialLinkText = "toy")
    private WebElement toy;
    @FindBy(xpath = "//span[@class='arrow']")
    private WebElement hovover;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[1]")
    private List<WebElement> dm;

    public void clickOnMotors(){
        motors.click ();

    }

    public void clickOnFashion(){

        fashion.click();
    }

    public void clickOnToy(){

        toy.click ();
    }

    public void clickOnElectronics(){

        electronics.click ();
    }

    public void clickOnCollectiblesArt(){

        collectiblesArt.click ();
    }

    public void clickOnHomeGarden(){
        homeGarden.click ();
    }

    public List<WebElement> getDm(){
        return dm;
    }

    public void shopHoverOverMenu() throws InterruptedException{
        Actions actions = new Actions ( driver );
        Thread.sleep ( 4000 );
        actions.moveToElement ( hovover ).build ().perform ();

        for (int i = 0; i < dm.size (); i++) {
            String tittles = dm.get ( i ).getText ();
            System.out.println ( tittles );
        }
        for (WebElement titles : dm) {
            System.out.println ( titles.getText () );
        }
    }
}
