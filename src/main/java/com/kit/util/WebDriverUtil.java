package com.kit.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Мир on 16.06.2017.
 */
public class WebDriverUtil {

    private WebDriver webDriver;
private WebDriverWait webDriverWait;

    public WebDriverUtil(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, 10);
    }

    public WebElement waitforExpectedCondition (ExpectedCondition expectedCondition){
         return (WebElement) webDriverWait.until(expectedCondition);
    }

}
