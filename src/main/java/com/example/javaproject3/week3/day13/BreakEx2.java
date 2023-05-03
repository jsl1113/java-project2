package com.example.javaproject3.week3.day13;

public class BreakEx2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i * i > 50) break;
            System.out.println(i);
        }
    }
}
