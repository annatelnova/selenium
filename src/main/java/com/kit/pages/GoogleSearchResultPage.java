package com.kit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Мир on 09.06.2017.
 */
public class GoogleSearchResultPage extends GoogleBasepage {

    By linkLocator = By.xpath(".//*[@id='rso']/div[2]/div/div[1]/div/div/h3/a");//id='rso это ближайший айди другого элемента
    private WebElement link;

    public GoogleSearchResultPage(WebDriver webDriver) {
        super(webDriver);

    }
    public String getLinkText (){
        link = webDriverUtil.waitforExpectedCondition(
                ExpectedConditions.visibilityOfElementLocated(linkLocator));
        link = webDriver.findElement(linkLocator);
        return link.getText();
}
public void clickLink (){

    webDriverUtil.jsClick("gb_70", "id"); // link.click()
    }
}
