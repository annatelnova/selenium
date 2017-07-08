package com.kit.core;

import com.kit.util.PropertiesCache;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.apache.commons.lang3.EnumUtils;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by Мир on 09.06.2017.
 */
@Listeners({com.kit.core.TestListener.class})

public class WebDriverTestBase {
    protected WebDriver webDriver;
    // -D to pass System variable to Selenium Framework
    //mvn -Dbrowser=CHROME or -Dbrowser=FF clean test - to run tests on diff browsers
    private String browser = System.getProperty("browser");
    //loads settings from test.properties file
    long implicitWait = Long.parseLong((PropertiesCache.getProperty("wait.implicit")));
    long pageLoad = Long.parseLong((PropertiesCache.getProperty("wait.pageLoad")));
    long setScript = Long.parseLong((PropertiesCache.getProperty("wait.setScript")));

    @BeforeClass
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "D:\\selenium\\src\\main\\resources\\chromedriver.exe"); //название системной переменной
        setBrowser();
        setWebDriverSettings();
    }

        public void  setWebDriverSettings(){
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);//каждый 0,5 сек
        webDriver.manage().timeouts().pageLoadTimeout(pageLoad, TimeUnit.SECONDS);
        webDriver.manage().timeouts().setScriptTimeout(setScript, TimeUnit.SECONDS);

    }
    public void setBrowser (){
        Browser runBrowser = EnumUtils.isValidEnum(Browser.class, browser) ?
                 Browser.valueOf(browser.toUpperCase()) : Browser.CHROME;
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
    @AfterClass
    public void tearDown(){
        //closes a browser
        webDriver.close();
        // closes a tab
       // webDriver.quit();
    }
}
