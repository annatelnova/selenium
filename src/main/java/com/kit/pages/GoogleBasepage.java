package com.kit.pages;

import com.kit.util.WebDriverUtil;
import org.openqa.selenium.WebDriver;

/**
 * Created by Мир on 16.06.2017.
 */
public class GoogleBasepage {
    protected WebDriver webDriver;
    protected WebDriverUtil webDriverUtil;

    public GoogleBasepage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverUtil = new WebDriverUtil(webDriver);

    }

    public void open (String url){
        webDriver.get (url);
    }
}
