package com.regrassionSuite;
  import base.CommonAPI;
  import org.openqa.selenium.By;
  import org.testng.annotations.Test;
  import org.testng.asserts.SoftAssert;
public class EbayHomePageTest extends CommonAPI {

        @Test
        public void buyLink() {
            driver.findElement( By.linkText("Buy")).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void sellLink() {
            driver.findElement(By.linkText("Sell")).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void toolsLink() {
            driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[6]/h3")).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void ebayCompaniesLink() {
            driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[3]/ul/li[1]/h3")).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void aboutEbayLink() {
            driver.findElement(By.linkText("About eBay")).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void helpContactLink() {
            driver.findElement(By.linkText("Help & Contact")).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void communityLink() {
            driver.findElement(By.linkText("Community")).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void StayConnectedLink() {
            driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[3]/ul/li[5]/h3")).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void homePageUrlVerification() {
            String actualURL = driver.getCurrentUrl();
            String expectedURL = "https://www.ebay.com/";

            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(actualURL, expectedURL);

            if (actualURL.equalsIgnoreCase(expectedURL)) {
                System.out.println("Passed");
            } else System.out.println("Failed");

        }


        @Test
        public void homePageTitleVerification() {
            String title = driver.getTitle();
            System.out.println(title);
        }


        @Test
        public void loginLinkVerification() {
            driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();
            driver.findElement ( By.xpath ( "//*[@id='userid']" ) ).sendKeys ( "mohdfaruque89@gmail.com" );
            driver.findElement ( By.xpath ( "//*[@id='pass']" ) ).sendKeys ( "Dhaka1234@" );
            driver.findElement ( By.id ( "sgnBt" ) ).click ();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        @Test
        public void registerLinkVerification() {
            driver.findElement(By.cssSelector("#gh-ug-flex > a")).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void buyLinkVerification() {
            driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[1]/h3/a")).click();
            String title = driver.getTitle();
            System.out.println(title);

            if (title.equalsIgnoreCase("All Categories - Browse and Discover more | eBay")) {
                System.out.println("Passed");
            } else System.out.println("Failed");


            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }





