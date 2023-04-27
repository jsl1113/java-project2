package com.example.javaproject3.week2.day9;

public class ComparisonOperatorsEx {
    public static void main(String[] args) {
        int iVal = 10;
        int iVal1 = 20;
        boolean result = iVal == iVal1;
        System.out.printf("iVal과 iVal1가 같은지? %b\n", iVal == iVal1);
        System.out.printf("iVal과 iVal1가 다른지? %b\n",  iVal != iVal1);
        System.out.printf("iVal과 iVal1가 작은지? %b\n",  iVal < iVal1);
        System.out.printf("iVal과 iVal1가 작거나 같은지? %b\n",  iVal <= iVal1);
        System.out.printf("iVal과 iVal1가 큰지? %b\n",  iVal > iVal1);
        System.out.printf("iVal과 iVal1가 크거나 같은지? %b\n",  iVal >= iVal1);
    }
}
