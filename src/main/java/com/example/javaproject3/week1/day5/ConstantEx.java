package com.example.javaproject3.week1.day5;

import com.example.javaproject3.week1.day3.PrintHello;

public class ConstantEx {
    public final int MAX_LEVEL = 3;
    public static final int MIN_LEVEL = 1;

    public static void main(String[] args) {
        final int iVal;
        iVal = 1;
        System.out.println(iVal);

        final PrintHello printHello = new PrintHello();  // 클래스도 final 을 써서 불변 객체로 만들 수 있음

    }
}
