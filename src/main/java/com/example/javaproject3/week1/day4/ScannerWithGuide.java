package com.example.javaproject3.week1.day4;

import java.util.Scanner;

public class ScannerWithGuide {
    public void printWithScanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("두 개의 숫자를 입력하세요.");
        System.out.println("첫 번째 숫자: " + sc.nextInt() + ", 두 번째 숫자: " + sc.nextInt());
    }
}
