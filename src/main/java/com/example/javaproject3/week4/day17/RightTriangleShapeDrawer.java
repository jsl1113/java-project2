package com.example.javaproject3.week4.day17;

public class RightTriangleShapeDrawer extends ShapeDrawer2 {

    public RightTriangleShapeDrawer(String symbol) {
        super(symbol);
    }

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));
    }

    public static void main(String[] args) {
        ShapeDrawer2 rightTriangle = new RightTriangleShapeDrawer(" ");
        rightTriangle.printShape(5);
    }
}
