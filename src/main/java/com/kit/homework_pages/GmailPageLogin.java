package com.kit.homework_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Мир on 09.06.2017.
 */
public class GmailPageLogin {
    private WebDriver webDriver;
    private WebElement searchLogField;
    private WebElement nextButton;
    By loginLocator = By.id("identifierId");
    By nextButtonLocator = By.id("identifierNext");

    public GmailPageLogin(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void fillLogin(String login) {
        searchLogField = webDriver.findElement(loginLocator);
        searchLogField.sendKeys(login);
    }

    public void findAndClickNextButton() {
        nextButton = webDriver.findElement(nextButtonLocator);
        nextButton.click();

    }
}


