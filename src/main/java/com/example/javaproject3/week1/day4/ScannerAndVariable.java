package com.example.javaproject3.week1.day4;

import java.util.Scanner;

public class ScannerAndVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2 와 3 을 더하면 5 입니다.
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.println(val1 + val2);
        System.out.printf("%d와 %d의 합은 %d입니다.", val1, val2, val1 + val2);
    }
}
