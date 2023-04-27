package com.example.javaproject3.week2.day9;

public class BitOperator {
    public static void main(String[] args) {
        int val1 = 1;
        System.out.println(val1 << 1);
        System.out.println(Integer.toBinaryString(val1 << 1));
        System.out.println(val1 << 2);
        System.out.println(Integer.toBinaryString(val1 << 2));

        int val2 = 32;
        System.out.println(val2 >> 1);
        System.out.println(Integer.toBinaryString(val2 >> 1));
        System.out.println(val2 >> 2);
        System.out.println(Integer.toBinaryString(val2 >> 2));
    }
}
