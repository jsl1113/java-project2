package com.example.javaproject3.week4.day15;

import java.util.Scanner;

public class 직각삼각형_오른쪽정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
