package com.kit.homework_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;


/**
 * Created by Мир on 11.06.2017.
 */
public class GmailPagePassword {


    private WebDriver webDriver;

    private WebElement searchPassField;
    private WebElement nextButton;
    //private WebElement link;
    By nextButtonLocator = By.id("passwordNext");
    By passwordLocator = By.name("password");


    public GmailPagePassword(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public void fillPassword(String password) {
        searchPassField = webDriver.findElement(passwordLocator);
        searchPassField.sendKeys(password);
    }

    public void findAndClickNextButton() {

        nextButton = webDriver.findElement(nextButtonLocator);
        nextButton.click();
    }
}
