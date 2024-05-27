package com.veeva.framework.base;

import org.openqa.selenium.support.PageFactory;

import java.io.File;

/**
 * Created by Rohit
 */
public class Base {
    public static BasePage currentPage;
    protected File fileConfig = new File ( "com/veeva/framework/config/GlobalConfig.properties" );

    public <TPage extends BasePage> TPage getInstance(Class<TPage> page){
        Object obj = PageFactory.initElements(DriverContext.driver, page);
        return page.cast(obj);
    }
}
