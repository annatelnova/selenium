package com.kit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 * Created by Мир on 09.06.2017.
 */
public class GoogleSearchPage extends GoogleBasepage {

    By searchLocator = By.cssSelector("#lst-ib");
   // @FindBy(name = "q")
    private WebElement searchField;


    public GoogleSearchPage (WebDriver webDriver){
        super(webDriver); // конструктор child класса ставится на первое место
       // this.webDriver = webDriver; это не нужно когда есть base page


            }


    public void fillAndSubmitSearchData(String searchText){
      //searchField =  webDriverUtil.waitforExpectedCondition(ExpectedConditions.visibilityOfElementLocated(searchLocator));
          searchField = webDriver.findElement(searchLocator);
           searchField.sendKeys(searchText);
           searchField.submit();

}}

