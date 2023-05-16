package com.example.javaproject3.week5.day21;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
//                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
                if ((isAscending ? arr[j] - arr[j - 1] : arr[j-1] - arr[j]) > 0) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        // i j j-1
        // 1 1 0
        // 2 2 1
        // 2 1 0
        // 3 3 2
        // 3 2 1
        // 3 1 0
        InsertionSort01 is = new InsertionSort01();
        is.sort(arr, true);
        System.out.println(Arrays.toString(arr));
    }
}
