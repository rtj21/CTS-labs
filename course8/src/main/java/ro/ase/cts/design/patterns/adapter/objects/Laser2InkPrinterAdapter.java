package ro.ase.cts.design.patterns.adapter.objects;

import ro.ase.cts.printer.InkPrinter;
import ro.ase.cts.printer.InkPrinterInterface;
import ro.ase.cts.printer.laser.LaserPrinterInterface;

public class Laser2InkPrinterAdapter implements InkPrinterInterface {
    LaserPrinterInterface laserprinter;

    public Laser2InkPrinterAdapter(LaserPrinterInterface laserprinter) {
        this.laserprinter = laserprinter;
    }

    private Laser2InkPrinterAdapter(){

    }

    @Override
    public void inkPrint(String text) {
        String[] paragraphs = text.split("\n");
        this.laserprinter.laserPrint(paragraphs);
    }

    @Override
    public void cancelPrint() {
        this.laserprinter.cancelPrinting();
    }
}
