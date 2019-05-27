package com.regrassionSuite;


import com.regrassion.EbaySigninPage;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageBase.PageBase;

import java.util.concurrent.TimeUnit;

public class EbaySigninPageTest extends PageBase {

    private Object EbaySigninPageTest;

    @BeforeMethod


public void init(){
EbaySigninPageTest = PageFactory.initElements ( driver,EbaySigninPageTest.class );
driver.getCurrentUrl ();
    }
        @Test
        public void setEbaySigninPageTest(){
            clickOnElement ( "SighInTab" );
        }

        @Test

         public void userNameFieldTest(){

         clickOnElement ( "UserNameField" );


        }

                @Test
            public void PasswordFieldTest() {
               clickOnElement ( "password" );
            }



        }
