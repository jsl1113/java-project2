package com.example.javaproject3.week3.day11;

public class MultiplicationTableStep3 {
    public static void main(String[] args) {
        for (int j = 2; j <= 4; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d\n", j, i, j * i);
            }
        }
    }
}
