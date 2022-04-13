import ro.ase.cts.design.patterns.adapter.objects.Laser2InkPrinterAdapter;
import ro.ase.cts.printer.InkPrinter;
import ro.ase.cts.printer.InkPrinterInterface;
import ro.ase.cts.printer.laser.LaserPrinter;
import ro.ase.cts.printer.laser.LaserPrinterInterface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<InkPrinterInterface> inkPrinters = new ArrayList<>();

        InkPrinterInterface hrPrinter = new InkPrinter();
        InkPrinterInterface devPrinter = new InkPrinter();

        inkPrinters.add(hrPrinter);
        inkPrinters.add(devPrinter);

        hrPrinter.inkPrint("CV.doc");

        LaserPrinterInterface ceoPrinter = new LaserPrinter();
        Laser2InkPrinterAdapter laserAdapter = new Laser2InkPrinterAdapter(ceoPrinter);

        inkPrinters.add(laserAdapter);

        for(InkPrinterInterface printer : inkPrinters){
            printer.inkPrint("Hello! \n How are you?");
            System.out.println("miau");
        }


    }
}
