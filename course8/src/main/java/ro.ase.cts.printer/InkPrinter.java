package ro.ase.cts.printer;

public class InkPrinter implements InkPrinterInterface{
    @Override
    public void inkPrint(String text) {
        System.out.println(text);
    }

    @Override
    public void cancelPrint() {

    }
}
