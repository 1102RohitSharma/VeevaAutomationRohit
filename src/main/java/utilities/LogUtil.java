package com.veeva.framework.utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LogUtil {
    ZonedDateTime date = ZonedDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHMMSSS");
    String fileNameFormatter = date.format(formatter);
    private BufferedWriter bufferedWriter = null;

    public void createLogFile() throws IOException {
        try {
            File dir = new File("logs/");
            if (!dir.exists())
                dir.mkdir();
            File logFile = new File(dir + "/" + fileNameFormatter + ".log");
            FileWriter fileWriter = new FileWriter(logFile.getAbsoluteFile());
            bufferedWriter = new BufferedWriter(fileWriter);
        }catch(Exception e){
            e.getStackTrace();
        }
    }

    public void write(String message){
        try{
            bufferedWriter.write(message);
            bufferedWriter.close();
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
