package com.example.javaproject3.week2.day6;

public class FloatAndDoubleEx {
    public static void main(String[] args) {
        System.out.println("f1 = " + 3.14f);
        System.out.println("f2 = " + 1.23e10f);
        System.out.println("d1 = " + 3.141592653589793);
        System.out.println("d2 = " + 1.23e100);
        System.out.println("result = " + 3.14f * 2.0f);
        System.out.println("result2 = " + 3.141592653589793 / 2.0);

        float f2 = 1.23e7f;
        float f3 = 1.23e8f;
        float f4 = 1.23e9f;
        float f5 = 1.23e10f;
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);

        double d5 = 1.23e10;
        System.out.println(d5);
    }
}
