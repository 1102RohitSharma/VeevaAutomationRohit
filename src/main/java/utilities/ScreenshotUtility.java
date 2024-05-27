package com.veeva.framework.utilities;

        import com.veeva.framework.base.Base;
        import com.veeva.framework.base.DriverContext;
        import org.apache.commons.io.FileUtils;
        import org.openqa.selenium.OutputType;
        import org.openqa.selenium.TakesScreenshot;

        import java.io.File;
        import java.io.IOException;
        import java.text.SimpleDateFormat;
        import java.util.Calendar;



public class ScreenshotUtility extends Base {
    public void captureScreenshot ( ) throws IOException {
        String timestamp = getTimeStamp ( );
        System.out.println ( "timestam: " + timestamp );
        File F = ((TakesScreenshot) new DriverContext( )).getScreenshotAs ( OutputType.FILE );
        File dest = new File ( new ReadFile ( ).readProperty ( fileConfig, "screenshotpath" ) + File.separator + timestamp + ".png" );
        FileUtils.copyFile ( F, dest );
    }

    public String getTimeStamp ( ) {
        return new SimpleDateFormat ( "yyyyMMdd_HHmmss" ).format ( Calendar.getInstance ( ).getTime ( ) );
    }
}