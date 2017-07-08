package com.kit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;


/**
 * Created by Мир on 09.06.2017.
 */
public class GoogleSearchPage extends GoogleBasepage {

    By searchLocator = By.cssSelector("#lst-ib"); //("#lst-ib");
   // @FindBy(name = "q")
    private WebElement searchField;


    public GoogleSearchPage (WebDriver webDriver){
        super(webDriver); // конструктор child класса ставится на первое место
       // this.webDriver = webDriver; это не нужно когда есть base page


            }
@Attachment (value = "{0}", type = "text/plain")//возвращает то что возвращает метод, а так как void то ничего в файле нет
@Step ("Fills a search text {0} and presses the enter")//ставится над методом
    public void fillAndSubmitSearchData(String searchText) {
    //searchField =  webDriverUtil.waitforExpectedCondition(ExpectedConditions.visibilityOfElementLocated(searchLocator));
    searchField = webDriver.findElement(searchLocator);
    searchField.sendKeys(searchText);
  //  webDriverUtil.jsClick("btnK", "name");
    searchField.submit();

}
}

