package com.example.javaproject3.week2.day6;

public class NarrowingCasting {
    public static void main(String[] args) {
        double dVal = 123.456;
        int ival = (int) dVal;
        System.out.println("dVal = " + dVal);
        System.out.println("iVal = " + ival);

        String str = "1";
        int num = Integer.parseInt(str);

        String str1 = "123ab"; // 숫자가 아닌 문자열
//        int num = Integer.parseInt(str1); // NumberFormatException 발생

        int result = 1 + Integer.parseInt("1");
        System.out.println(result); // 2가 출력됨

        String val1 = "1.5";
        String val2 = "2.5";
        System.out.println(val1 + val2);
        float result1 = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println(result1);
    }
}
