package com.example.javaproject3.week2.day8;

import java.util.Arrays;

public class TwoDimArrFillRow {
    static int[][] arr;
    public static void fillRow(int r){
        for(int i=0; i<arr.length; i++){
            arr[r][i] = 1;
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
//        arr[2][0] = 1;
//        arr[2][1] = 1;
//        arr[2][2] = 1;
//        arr[2][3] = 1;
//        arr[2][4] = 1;
        fillRow(2);
        printArray(arr);
    }
}
