package com.example.javaproject3.week4.day16;

import java.util.Arrays;

public class CodeUp1098_oop {
    private int[][] arr;
    public CodeUp1098_oop(int row, int col) {
        this.arr = new int[row][col];
    }

    public void setBeam(int l, int d, int x, int y) {
        for (int i = 0; i < l; i++) {
            if (d == 0)
                arr[x - 1][y + i - 1] = 1;
            else
                arr[x + i - 1][y - 1] = 1;
        }
    }

    public void printArray() {
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        CodeUp1098_oop codeUp1098 = new CodeUp1098_oop(5, 5);
        codeUp1098.printArray();
        codeUp1098.setBeam(2, 0, 1, 1);
        codeUp1098.printArray();
        codeUp1098.setBeam(3, 1, 2, 3);
        codeUp1098.printArray();
        codeUp1098.setBeam(4, 1, 2, 5);
        codeUp1098.printArray();

    }
}
