package com.kit.homework_pages;

import org.openqa.selenium.*;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

/**
 * Created by Мир on 12.06.2017.
 */
public class GmailAfterSignin {
    private WebDriver webDriver;
    private WebElement button;

    By mailsLocator = By.xpath(".//*[@id='gbw']/div/div/div[1]/div[2]/a");

    public GmailAfterSignin(WebDriver webDriver) {
        this.webDriver = webDriver;

    }
   // Alert alert = webDriver.switchTo().alert().dismiss() or .accept();


//    public void safeAlertDissmiss() {
//        try {
//            webDriver.switchTo().alert().dismiss();
//        } catch (NoAlertPresentException e) {
//            // ничего не делаем, алерта и так нет
//        }
//    }

    public void clickMail() {
        button = webDriver.findElement(mailsLocator);
        button.click();
    }
}