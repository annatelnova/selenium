package com.kit.core.homework.lesson22;

import com.kit.core.WebDriverTestBase;
import com.kit.homework_pages.GmailAfterSignin;
import com.kit.homework_pages.GmailPageLogin;
import com.kit.homework_pages.GmailPagePassword;
import com.kit.homework_pages.GooglePage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Мир on 09.06.2017.
 */
public class GmailTest extends WebDriverTestBase {
    private final String gmailSignin  = "https://google.com.ua/"; //тестовые данные preconditions в начале тестового класса или тестового метода
    private final String login = "herdamre@gmail.com";
    private final String password = "10stepsinua";

    @Test (enabled = false)
    public void searchTest() {
       // тут можно создать локальную переменную, которая будет использована только в середине этого метода
        GooglePage openGooglePage = new GooglePage(webDriver);
        openGooglePage.open(gmailSignin);
        openGooglePage.findAndClickSigninButton();

        GmailPageLogin enterLoginPage = new GmailPageLogin(webDriver);
        enterLoginPage.fillLogin(login);
        enterLoginPage.findAndClickNextButton();

        GmailPagePassword enterPassPage = new GmailPagePassword(webDriver);
        enterPassPage.fillPassword(password);
        enterPassPage.findAndClickNextButton();

        GmailAfterSignin navigatetoinbox = new GmailAfterSignin(webDriver);
       // navigatetoinbox.safeAlertDissmiss();
        navigatetoinbox.clickMail();


}

}
