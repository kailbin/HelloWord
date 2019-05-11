package xyz.kail.ood.helloworld;

/**
 * 懒汉
 */
public class PrinterLazySingleFactory {

    public static PrinterFactory instance() {
        return PrinterHungrySingleFactory.instance();
    }

}
