package com.example.javaproject3.week2.day8;

import java.util.Arrays;

public class TwoDimArrFillColumn {
    static int[][] arr;
    public static void fillColumn(int c){
        for(int i=0; i<arr.length; i++){
            arr[i][c] = 1;
        }
    }
    public static void printArray(int[][] arr){   // parameter
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        arr = new int[5][5];
        fillColumn(4);
        printArray(arr);
    }
}
