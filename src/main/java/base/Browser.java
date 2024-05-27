package com.veeva.framework.base;

import org.openqa.selenium.WebDriver;

public class Browser extends Base{
    public BrowserType Type;
    private WebDriver _driver;

    public Browser(WebDriver driver) {
        _driver = driver;
    }

    public void getUrl(String url){
        _driver.get(url);
    }

//    maximize window
//   minimize window
//

}
