package com.example.javaproject3.week5.day20;

import java.util.Arrays;

public class bubbleSort03 {
    public int[] sort(int[] arr, boolean isAscend){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (isSortElements(arr[i], arr[j], isAscend)) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public boolean isSortElements(int c1, int c2, boolean isAscend) {
        if (isAscend) {
            if(c1 < c2) return false;
            else return true;
        }
        else {
            if(c1 > c2) return false;
            else return true;
        }
    }

    public static void main(String[] args) {
        bubbleSort03 bubbleSort03 = new bubbleSort03();
        int[] arr = {7, 2, 3, 9, 28, 1};
        bubbleSort03.sort(arr, false);
        System.out.println(Arrays.toString(arr));

    }
}
