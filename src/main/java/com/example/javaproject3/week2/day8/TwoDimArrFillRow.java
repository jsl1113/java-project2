package com.example.javaproject3.week2.day8;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void fillARow(int[][] arr, int row){
//        for(int i=0; i<arr.length; i++){
//            arr[row][i] = 1;
//        }
        //        arr[2][0] = 1;
        arr[row][1] = 1;
        arr[row][2] = 1;
        arr[row][3] = 1;
        arr[row][4] = 1;
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
//        arr[2][0] = 1;
//        arr[2][1] = 1;
//        arr[2][2] = 1;
//        arr[2][3] = 1;
//        arr[2][4] = 1;
        fillARow(arr,2);
    }
}
