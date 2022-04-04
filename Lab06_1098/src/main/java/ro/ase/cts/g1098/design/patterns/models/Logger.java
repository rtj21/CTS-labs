package ro.ase.cts.g1098.design.patterns.models;

import ro.ase.cts.g1098.design.patterns.exceptions.MissingInputArgException;
import ro.ase.cts.g1098.design.patterns.interfaces.ILogging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger implements ILogging {
    private static Logger logger;

    private String filename;
    private String messagePattern;
    private File logFile;

    public Logger(String filename, String messagePattern) throws MissingInputArgException, IOException {
        if(filename == null || filename.length() < 4){
            throw new MissingInputArgException();
        }
        this.filename = filename;
        this.messagePattern = messagePattern != null ? messagePattern : "";

        this.logFile = new File(this.filename);
        if(!this.logFile.exists()){
            this.logFile.createNewFile();
        }
    }

    @Override
    public void log(String msg) {
        String log = String.format("%s (%s) - %s",
                this.messagePattern,
                LocalDateTime.now().toString(), msg);

        try {
            FileWriter fileWriter = new FileWriter(logFile, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(log);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ILogging getLogger(String fileName, String pattern) throws MissingInputArgException,IOException {
        if(logger == null){
            //try {
                logger = new Logger(fileName,pattern);
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (MissingInputArgException m){
//                throw new MissingInputArgException();
//            }
        }
        return logger;
    }
}
