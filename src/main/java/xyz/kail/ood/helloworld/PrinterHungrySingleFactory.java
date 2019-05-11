package xyz.kail.ood.helloworld;

/**
 * 饿汉
 */
public class PrinterHungrySingleFactory {

    private static final PrinterFactory INSTANCE = new PrinterFactory();

    public static PrinterFactory instance() {
        return INSTANCE;
    }

}
