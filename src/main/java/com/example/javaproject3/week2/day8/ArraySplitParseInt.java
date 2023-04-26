package com.example.javaproject3.week2.day8;

import java.util.Scanner;

public class ArraySplitParseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // 값을 읽어 옴
        String[] numbers = input.split(","); // ,기준으로 분리
        int v1 = Integer.parseInt(numbers[0]); // int 타입으로 변환
        int v2 = Integer.parseInt(numbers[1]);
        int v3 = Integer.parseInt(numbers[2]);
        System.out.println(v1 + v2 + v3); // 세 개 값을 더한 후 출력
    }
}
