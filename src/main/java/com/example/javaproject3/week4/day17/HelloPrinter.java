package com.example.javaproject3.week4.day17;

import java.io.IOException;

public class HelloPrinter extends ShapeDrawer3 {

    public HelloPrinter(Printer2 printer2) {
        super(printer2);
    }

    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new ConsolePrinter2());
        hp.repeatMessage(5, "Hello");
        HelloPrinter hp1 = new HelloPrinter(new FilePrinter2());
        hp1.repeatMessage(3,  "Hi~");
    }
}
