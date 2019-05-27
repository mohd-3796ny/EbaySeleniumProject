package com.regrassion;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageBase.PageBase;

public class EbayRegistrationPage extends PageBase {

   @FindBy(id = "gh-ug-flex")
   private WebElement registerButton;

   @FindBy(id = "firstname")
   private WebElement firstname;

   @FindBy(id = "lastname")
   private WebElement lastname;

   @FindBy(id = "email_r")
   private WebElement email;

   @FindBy(id = "PASSWORD_helper")
   private WebElement password;

   @FindBy(id = "ppaFormSbtBtn")
   private WebElement createAccBtn;

   public void clickOnRegistarLink(){
      registerButton.click ( );
   }

   public void setFirstname(){
      firstname.sendKeys ( "Mohd" );
   }

   public void setLastname(){
      lastname.sendKeys ( "Faruque" );
   }

   public void setEmail(){
      email.sendKeys ( "mohdfaruque89@gmail.com" );
   }

   public void setPassword(){
      password.sendKeys ( "Dhaka1234@" );
   }

   public void clickOnCreateAccBtn(){
      createAccBtn.click ( );

   }


}