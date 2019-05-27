package searchTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import searchPages.SearchPage;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearch extends CommonAPI {

    @Test
    public void searchItemsOnAmazonSearchBox()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsFromArrayListAndSubmitButton();
    }

    @Test
    public void searchItemsFromDB()throws Exception{
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsFromArrayListAndSubmitButton();
    }
}
