package com.example.javaproject3.week4.day16;

import java.util.Scanner;

public class Pyramid {
    public void printPyramid(int height){
        for(int i=0; i<height; i++){
            System.out.printf("공백개수: %d 별 개수: %d\n", height - i - 1, 2 * i + 1);
        }
    }
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        int height = 4;
        pyramid.printPyramid(height);
    }
}
