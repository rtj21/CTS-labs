package ro.ase.cts.printer.laser;

public class LaserPrinter implements LaserPrinterInterface{
    @Override
    public void laserPrint(String[] paragraphs) {
        for (String para: paragraphs) {
            System.out.println(para);
        }
    }

    @Override
    public void cancelPrinting() {
        System.out.println("stop!");
    }
}
