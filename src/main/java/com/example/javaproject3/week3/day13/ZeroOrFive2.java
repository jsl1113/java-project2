package com.example.javaproject3.week3.day13;

public class ZeroOrFive2 {
    public static void main(String[] args) {
        // Main 메소드 만으로 처리하기
        int num = 555;
        int cnt = 0;

        String flagText = "0 또는 5로만 이루어진 숫자";
        while(num > 0){
            int remainder = num % 10;
            if(remainder % 5 != 0){
                flagText = "0 또는 5로만 이루어진 숫자가 아님";
                break;
            }
            num /= 10;
        }
        System.out.println(flagText);
    }
}
