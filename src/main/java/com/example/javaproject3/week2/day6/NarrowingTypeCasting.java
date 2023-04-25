package com.example.javaproject3.week2.day6;

public class NarrowingTypeCasting {
    public static void main(String[] args) {
        short s; int i; long l; float f; double d = 1.2345678912345;
        f = (float) d;
        System.out.println("f = " + f + ", d = " + d);
        l = (long) f; i = (int) l; s = (short) i;
        System.out.println("s = " + s + ", i = " + i + ", l = " + l);
    }
}
