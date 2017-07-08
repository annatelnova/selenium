package com.kit.core.classwork;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.GoogleSearchPage;
import com.kit.pages.GoogleSearchResultPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Мир on 09.06.2017.
 */

@Features("GoogleSearch")
@Stories({"WEB-777"})
@Listeners ({com.kit.core.TestListener.class})
public class GoogleSearchTest extends WebDriverTestBase {
    private String googleSearch  = "https://www.google.com.ua/";
    private String searchText = "Selenium";

    @Title("Google search test - positive scenario")
    @Description("Searches any test on google.com")
    @Test
    public void searchTest() {
        // GoogleSearchPage googleSearchPage = PageFactory.initElements(webDriver, GoogleSearchPage.class);
        GoogleSearchPage googleSearchPage = new  GoogleSearchPage(webDriver);
        googleSearchPage.open(googleSearch);
        googleSearchPage.fillAndSubmitSearchData(searchText);
        GoogleSearchResultPage googleSearchResultPage = new GoogleSearchResultPage(webDriver);
        //googleSearchResultPage.takeScreenshot(searchText);
               assertTrue(googleSearchResultPage.getLinkText().contains(searchText));
        googleSearchResultPage.clickLink();
    }
}

