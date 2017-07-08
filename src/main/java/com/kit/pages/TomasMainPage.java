package com.kit.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Мир on 30.06.2017.
 */
public class TomasMainPage {
    private WebDriver webDriver;

    By dropdownLocator = By.id("SearchbarForm-duration");
    private WebElement selectedElem;

    public TomasMainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open(String url) {
        webDriver.get(url);
    }



    public void clickdropdown(String selectedElemLocator) {
        Select durationDropdown = new Select(webDriver.findElement(dropdownLocator));
        durationDropdown.selectByVisibleText(selectedElemLocator);

    }
    public String getText (){
        selectedElem = webDriver.findElement(dropdownLocator);
        return selectedElem.getText();
    }
}

