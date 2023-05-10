package com.example.javaproject3.week4.day17;

import java.io.IOException;

public class ShapeDrawer3 {
    Printer2 printer2;

    public ShapeDrawer3(Printer2 printer2) {
        this.printer2 = printer2;
    }

    public void repeatMessage(int n, String message) throws IOException {
        for(int i=0; i<n; i++){
            printer2.print(message);
        }
    }
}
