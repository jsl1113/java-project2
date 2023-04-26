package com.example.javaproject3.week2.day8;

import java.util.Arrays;

public class TwoDimArrFillColumn {
    public static void fillColumn(int[][] arr, int col){
//        for(int i=0; i<arr.length; i++){
//            arr[i][col] = 1;
//        }
        arr[0][col] = 1;
        arr[1][col] = 1;
        arr[2][col] = 1;
        arr[3][col] = 1;
        arr[4][col] = 1;
        printArray(arr);
    }
    public static void printArray(int[][] arr){   // parameter
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        fillColumn(arr, 4);
    }
}
