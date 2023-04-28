package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();
        System.out.printf("%.1f MB\n", (double) h*b*c*s/8388608);
    }
}
