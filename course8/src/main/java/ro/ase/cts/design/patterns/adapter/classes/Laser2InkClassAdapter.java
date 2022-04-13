package ro.ase.cts.design.patterns.adapter.classes;

import ro.ase.cts.printer.InkPrinterInterface;
import ro.ase.cts.printer.laser.LaserPrinterInterface;

public class Laser2InkClassAdapter implements LaserPrinterInterface, InkPrinterInterface {
    @Override
    public void inkPrint(String text) {
        System.out.println(text);

    }

    @Override
    public void laserPrint(String[] paragraphs) {
        for (String para: paragraphs) {
            System.out.println(para);
        }
    }

    @Override
    public void cancelPrint() {

    }
}
