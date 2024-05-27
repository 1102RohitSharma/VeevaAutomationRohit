package com.veeva.test.stedefinition;

import com.veeva.framework.base.Base;
import com.veeva.framework.base.DriverContext;
import com.veeva.framework.utilities.ReadFile;
import com.veeva.framework.utilities.ScreenshotUtility;
import org.junit.After;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
////import com.cucumber.listeners.Reporter;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class CucumberHooks extends Base {
    public CucumberHooks() {
        this.driver = DriverContext.driver;
    }

    static Collection<String> scenario = null;
//    DriverMethods dm = new DriverMethods ( );
    ScreenshotUtility cs = new ScreenshotUtility ( );
    private WebDriver driver;
//    @AfterClass
//    public static void writeExtentReport() {
////        Reporter.loadXMLConfig(new File(ReadFile.getInstance().getConfigReader().getReportConfigPath()));
//
//    }
    @After
    public void closeBrowser ( ) throws IOException {
//        dm.waitImplicitly ( 1000 );
        cs.captureScreenshot ( );
        driver.close ( );
        driver.quit ( );
        driver = null;
    }
}
