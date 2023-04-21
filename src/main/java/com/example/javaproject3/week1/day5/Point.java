package com.example.javaproject3.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXY(){
        return x == y;
    }

    double getDistance(Point p){
        int xL = p.x - this.x;
        int yL = p.y - this.y;

        double sumOfPow = Math.pow(xL, 2) + Math.pow(yL, 2);
        double result = Math.sqrt(sumOfPow);

        return result;
    }
}
