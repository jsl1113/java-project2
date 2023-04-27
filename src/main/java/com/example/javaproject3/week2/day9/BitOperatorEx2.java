package com.example.javaproject3.week2.day9;

public class BitOperatorEx2 {
    public static void main(String[] args) {
        int val1 = 1;
        System.out.println(Integer.toBinaryString(val1));
        System.out.println(Integer.toBinaryString(~val1));

        int n1 = 3 & 5;  // 1
        int n2 = 3 | 5; // 7
        int n3 = 3 ^ 5;  // 6
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(Integer.toBinaryString(n1));
        System.out.println(Integer.toBinaryString(n2));
        System.out.println(Integer.toBinaryString(n3));
    }
}
