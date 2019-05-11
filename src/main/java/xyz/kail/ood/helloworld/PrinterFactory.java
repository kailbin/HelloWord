package xyz.kail.ood.helloworld;

public class PrinterFactory {

    static {
        System.out.println("PrinterFactory loading...");
    }

    public static Printer infoPrinter() {
        return new InfoPrinter();
    }

    public static Printer errorPrinter() {
        return new ErrorPrinter();
    }
}
