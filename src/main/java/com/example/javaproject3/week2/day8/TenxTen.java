package com.example.javaproject3.week2.day8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TenxTen {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        int[][] arr10x10 = new int[10][10];
//        System.out.println(Arrays.toString(arr10x10[0]));
//        System.out.println(Arrays.toString(arr10x10[1]));
//        System.out.println(Arrays.toString(arr10x10[2]));
//        System.out.println(Arrays.toString(arr10x10[3]));
//        System.out.println(Arrays.toString(arr10x10[4]));
//        System.out.println(Arrays.toString(arr10x10[5]));
//        System.out.println(Arrays.toString(arr10x10[6]));
//        System.out.println(Arrays.toString(arr10x10[7]));
//        System.out.println(Arrays.toString(arr10x10[8]));
//        System.out.println(Arrays.toString(arr10x10[9]));

        for(int i=0; i<10; i++){
            System.out.println(Arrays.toString(arr10x10[i]));
        }
    }
}
