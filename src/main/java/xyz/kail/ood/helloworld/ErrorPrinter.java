package xyz.kail.ood.helloworld;

/**
 * ErrorPrinter
 */
public class ErrorPrinter implements Printer {

    public void println(Object data) {
        System.err.println(data);
    }
}
