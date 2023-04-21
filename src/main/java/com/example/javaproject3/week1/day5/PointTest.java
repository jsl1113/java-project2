package com.example.javaproject3.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 20;
        System.out.printf("x,y 가 같은지? : %s\n", p1.isSameXY());
//        System.out.printf("Point : (%d, %d)\n", p1.x, p1.y);

        Point p2 = new Point();
        p2.x = 30;
        p2.y = 30;
        System.out.printf("x,y 가 같은지? : %s\n", p2.isSameXY());
//        System.out.printf("Point1 : (%d, %d)\n", p2.x, p2.y);

        Point p3 = new Point();
        p3.x = 50;
        p3.y = 50;
        System.out.printf("x,y 가 같은지? : %s\n", p3.isSameXY());
//        System.out.printf("Point1 : (%d, %d)\n", p2.x, p2.y);
    }
}
