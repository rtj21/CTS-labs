package ro.ase.cts.printer.laser;

public interface LaserPrinterInterface {
    void laserPrint(String[] paragraphs);
    void cancelPrinting();
}
