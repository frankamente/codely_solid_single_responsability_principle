package com.company;

public class StandardOutputPrinter implements Printer {
    @Override
    public void printPage(String page) {
        System.out.println(page);
    }
}
