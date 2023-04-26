package com.example.javaproject3.week2.day8;

import java.util.Arrays;

public class ArrayDefineAndPrint4 {
    public static void main(String[] args) {
        int[] iArr = new int[]{1, 2, 3, 8};

        int[][] arr32 = new int[3][2];
        int[][] arr67 = new int[6][7];

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(arr2[0]));
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(Arrays.toString(arr2[2]));

        System.out.println(arr2[0][1]);
    }
}
