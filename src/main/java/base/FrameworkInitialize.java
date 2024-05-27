package com.veeva.framework.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;
import java.sql.Driver;

public class FrameworkInitialize extends Base {
    WebDriver driver = null;

    public void initializeBrowser(BrowserType browserType) {
        switch (browserType) {
            case chrome:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case firefox:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case edge:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case safari:
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;
            default:
                System.out.println("No browser type is defined");
        }
        //set the driver
        DriverContext.setDriver(driver);

        //Set the browser
        DriverContext.browser = new Browser(driver);
    }

    public void maximizeWindow() throws IOException {
        driver.manage().window().maximize();
    }

}
