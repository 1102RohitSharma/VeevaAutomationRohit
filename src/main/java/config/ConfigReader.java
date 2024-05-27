package utilities;

import dataProvider.ConfigFileReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {
    private static Properties prop = new Properties ( );
    String values = "";
    private static ConfigFileReader configFileReader;
    private FileInputStream readFile (File file) throws FileNotFoundException {
        return new FileInputStream( file );
    }
    public String readProperty (File file, String key) throws IOException {
        if ( file.exists ( ) ) {
            prop.load ( readFile ( file ) );
            values = prop.getProperty ( key );
        }
        return values;
    }

    public ConfigFileReader getConfigReader() {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }
}
