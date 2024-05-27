package com.veeva.test.pageobject;

import com.veeva.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreProductPage extends BasePage {

//    public CoreProductPage() {}
    @FindBy(id = "name")
    private WebElement ele;

    public BasePage clikCoreProductPage(){
        currentPage = getInstance(DerivedProject2Page.class);
//        currentPage=currentPage.As(DerivedProject2Page.class).test();
        return getInstance(DerivedProject2Page.class);
    }
}
