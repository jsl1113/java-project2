package com.example.javaproject3.week2.day7;

public class StringSplit {
    public static void main(String[] args) {
        String str = "10 3 19 28 7 488";
        String[] strArr = str.split(" ");

        for(int i=0; i<strArr.length; i++){
            System.out.println(strArr[i]);
        }
    }
}
