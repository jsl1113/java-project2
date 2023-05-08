package com.example.javaproject3.week4.day15;

import java.util.Scanner;

public class 피라미드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // n = 4
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");

            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");

            for (int j = i; j < n; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
