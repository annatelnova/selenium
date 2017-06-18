package com.kit.core;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

/**
 * Created by Мир on 09.06.2017.
 */
public class WebDriverTestBase {
    protected WebDriver webDriver;
    private String browser = System.getProperty("browser");

    @BeforeSuite
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "D:\\selenium\\src\\main\\resources\\chromedriver.exe"); //название системной переменной
        setBrowser();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//каждый 0,5 сек

    }
    public void setBrowser (){
        Browser runBrowser = browser == null ? Browser.CHROME : Browser.valueOf(browser);
              switch (runBrowser){
            case CHROME:
                ChromeDriverManager.getInstance().setup(); // .version("2.26").setup() автоматически загружает и устанавливает последнюю версию браузера
                webDriver = new ChromeDriver();
                break;
            case FF:
                FirefoxDriverManager.getInstance().setup();
                webDriver = new FirefoxDriver();
                break;

        }
    }
    @AfterSuite
    public void tearDown(){
        //closes a browser
        webDriver.close();
        // closes a tab
       // webDriver.quit();
    }
}
