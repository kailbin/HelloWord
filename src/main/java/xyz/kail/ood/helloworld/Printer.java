package xyz.kail.ood.helloworld;

import java.io.PrintStream;

/**
 * 打印器
 */
public class Printer {

    public void println(String data) {
        PrintStream printer = System.out;
        printer.println(data);
    }

}
