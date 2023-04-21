package com.example.javaproject3.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 2;
        p1.y = 3;
        System.out.printf("x,y 가 같은지? : %s\n", p1.isSameXY());
//        System.out.printf("Point : (%d, %d)\n", p1.x, p1.y);

        Point p2 = new Point();
        p2.x = 0;
        p2.y = 0;
        System.out.printf("x,y 가 같은지? : %s\n", p2.isSameXY());
//        System.out.printf("Point1 : (%d, %d)\n", p2.x, p2.y);

        Point p3 = new Point();
        p3.x = 50;
        p3.y = 50;
        System.out.printf("x,y 가 같은지? : %s\n", p3.isSameXY());
//        System.out.printf("Point1 : (%d, %d)\n", p2.x, p2.y);
        System.out.printf("두 점 사이의 거리 : %f\n", p1.getDistance(p2));
    }
}
