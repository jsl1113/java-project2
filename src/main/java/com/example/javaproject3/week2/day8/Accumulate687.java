package com.example.javaproject3.week2.day8;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0; // 누적할 변수 선언
        answer = answer + num % 10; // 나머지 구해 누적하기
        System.out.printf("answer:%d\n", answer);
        num = num / 10;
        answer = answer + num % 10; // 나머지 구해 누적하기
        System.out.printf("answer:%d\n", answer);
        num = num / 10;
        answer = answer + num % 10; // 나머지 구해 누적하기
        System.out.printf("answer:%d\n", answer);
    }
}
