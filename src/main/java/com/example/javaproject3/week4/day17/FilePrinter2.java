package com.example.javaproject3.week4.day17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter2 implements Printer2 {
    BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));

    public FilePrinter2() throws IOException {

    }

    @Override
    public void print(String message) throws IOException {
        bw.append(message);
        bw.flush();
        bw.close();
    }
}
