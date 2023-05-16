package com.example.javaproject3.week5.day20;

import java.util.Arrays;
import java.util.Comparator;

public class bubbleSort01 {

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};
        for (int j = 1; j <= arr.length; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
