package com.example.javaproject3.week5.day21;

import java.util.Arrays;

public class SelectionSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        for (int j = 0; j < arr.length; j++) {
            int targetValue = arr[j];
            int targetIdx = j;
            for (int i = j+1; i < arr.length; i++) {
                if (targetValue > arr[i]) {
                    targetValue = arr[i];
                    targetIdx = i;
                }
            }
            int tmp = arr[j];
            arr[j] = arr[targetIdx];
            arr[targetIdx] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
