package com.example.javaproject3.week4.day16;

public abstract class ShapeDrawer {
    public abstract String makeALine(int h, int i);

    public void printShape(int height){
        for(int i=0; i<height; i++){
            System.out.print(makeALine(height, i));
        }
    }
    public static void main(String[] args) {

    }
}
