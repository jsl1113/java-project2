package com.example.javaproject3.week4.day17;

public abstract class ShapeDrawer2 {
    protected String Symbol;

    public ShapeDrawer2(String symbol) {
        Symbol = symbol;
    }

    public abstract String makeALine(int h, int i);

    public void printShape(int h) {
        for (int i = 1; i <= h; i++) {
            System.out.printf("%s", makeALine(h, i));
        }
    }
}
