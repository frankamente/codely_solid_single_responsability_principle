package com.company;

public class Client {
    public Client() {
        final Book book = new Book();
        final String currentPage = book.getCurrentPage();
        final StandardOutputPrinter standardOutputPrinter = new StandardOutputPrinter();
        standardOutputPrinter.printPage(currentPage);
    }
}
