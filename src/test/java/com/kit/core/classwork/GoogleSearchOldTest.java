package com.kit.core.classwork;

import com.kit.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by Мир on 02.06.2017.
 */
@Features("GoogleSearch")
@Stories({"WEB-888"})
public class GoogleSearchOldTest extends WebDriverTestBase {
    private String googleSearch  = "https://www.google.com.ua/";


    @Test (enabled = false)
    public void searchTest() {
        webDriver.get(googleSearch);
        String searchText = "Selenium";
       By searchLocator = By.cssSelector("#lst-ib");
        //By searchLocator = By.xpath(".//*[@id='body']/center");
        //By searchLocator = By.name("q");
        WebElement searchField = webDriver.findElement(searchLocator);
        searchField.sendKeys(searchText);
        searchField.submit();
        By linkLocator = By.xpath(".//*[@id='rso']/div[2]/div/div[1]/div/div/h3/a");//id='rso это ближайший айди другого элемента
        WebElement link = webDriver.findElement(linkLocator);
        assertTrue(link.getText().contains(searchText));
        List<WebElement> webElementList = webDriver.findElements(By.cssSelector(".r>a"));
        if (!webElementList.isEmpty()) {
            for (WebElement webElement : webElementList) {
                assertTrue(webElement.getText().toLowerCase().contains(searchText));
            } } else {
                assertFalse("Element not Found", true);
            }

        }
    }


