package com.kit.core.classwork;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.TomasMainPage;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


/**
 * Created by Мир on 30.06.2017.
 */
public class TomasSelectDropdown extends WebDriverTestBase {
        private final String tomaspage = "https://www.thomascook.com/"; //тестовые данные preconditions в начале тестового класса или тестового метода


        @Test (enabled = false)
        public void openPage() {
            TomasMainPage openTomasPage = new TomasMainPage(webDriver);
            openTomasPage.open(tomaspage);
            openTomasPage.clickdropdown("10 Nights");

            //assertEquals(openTomasPage.getText(),"10 Nights");
            assertTrue(openTomasPage.getText().contains("10 Nights"));
        }
    }
