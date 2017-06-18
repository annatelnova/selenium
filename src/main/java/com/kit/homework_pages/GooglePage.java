package com.kit.homework_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Мир on 11.06.2017.
 */
public class GooglePage {
    private WebDriver webDriver;
    private WebElement searchButton;
    By signinLocator = By.id("gb_70");

    public GooglePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open(String url) {
        webDriver.get(url);
    }

    public void findAndClickSigninButton() {
        searchButton = webDriver.findElement(signinLocator);
        searchButton.click();

    }
}