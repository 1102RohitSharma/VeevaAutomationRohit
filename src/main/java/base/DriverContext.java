package com.veeva.framework.base;

import org.openqa.selenium.WebDriver;

public class DriverContext extends Base{

    public static WebDriver driver;
    public static Browser browser;

    public static void setDriver(WebDriver driver) {
        driver = driver;
    }
}
