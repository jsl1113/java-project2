package com.example.javaproject3.week3.day12;

public class While687 {
    public static void main(String[] args) {
        int n = 687;
        int answer = 0;
        answer += n % 10;
        answer += (n / 10) % 10;
        answer += (n / 100) % 10;

        int ans = 0;
        while (n != 0) {
            ans += n % 10;
            n /= 10;
        }
        System.out.println(ans);
    }
}
