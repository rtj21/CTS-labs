package ro.ase.cts.g1098.design.patterns;

import ro.ase.cts.g1098.design.patterns.interfaces.ILogging;
import ro.ase.cts.g1098.design.patterns.models.LoggerGenerator;
import ro.ase.cts.g1098.design.patterns.models.LoggerType;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ILogging errorLog = LoggerGenerator.getLogger(LoggerType.ERROR);
        errorLog.log("Hello!");

        System.out.println("the end");
    }
}
