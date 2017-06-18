package com.kit.core.classwork;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.GoogleSearchPage;
import com.kit.pages.GoogleSearchResultPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Мир on 09.06.2017.
 */
public class GoogleSearchTest extends WebDriverTestBase {
    private String googleSearch  = "https://www.google.com.ua/";
    private String searchText = "Selenium";

    @Test
    public void searchTest() {
        GoogleSearchPage googleSearchPage = PageFactory.initElements(webDriver, GoogleSearchPage.class);
        googleSearchPage.open(googleSearch);
        googleSearchPage.fillAndSubmitSearchData(searchText);
        GoogleSearchResultPage googleSearchResultPage = new GoogleSearchResultPage(webDriver);
        assertTrue(googleSearchResultPage.getLinkText().contains(searchText));
    }
}

