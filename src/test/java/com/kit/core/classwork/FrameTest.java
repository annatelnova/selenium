package com.kit.core.classwork;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.TomasMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by Мир on 30.06.2017.
 */
public class FrameTest extends WebDriverTestBase {
    private final String framePage = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select";
    private String dropdownValue = "Saab";

    @Test
    public void switchToFrame() {
     webDriver.get(framePage);
        WebElement iFrame = webDriver.findElement(By.id("iframeResult"));
        webDriver.switchTo().frame(iFrame);
        Select selectdropdown = new Select(webDriver.findElement(By.cssSelector("html>body>select")));
        selectdropdown.selectByVisibleText(dropdownValue);
        assertTrue(selectdropdown.getFirstSelectedOption().getText().contains( dropdownValue));

}

}
