package com.example.javaproject3.week3.day13;

public class IsPrime {
    public static void main(String[] args) {
        int num = 12;
        int factors = 0;  // 약수의 개수를 셈
        for (int i = 2; i < num; i++) {
            if(num % i == 0) factors++;
        }
        System.out.println(factors);
        System.out.println(num + (factors == 0 ? "은 소수" : "은 소수가 아님"));
    }
}
