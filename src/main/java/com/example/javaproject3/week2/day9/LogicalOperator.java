package com.example.javaproject3.week2.day9;

public class LogicalOperator {
    public static void main(String[] args) {
        int age = 25;
        boolean isStudent = false;
        if(age >= 18 && !isStudent){
            System.out.println("성인이며 학생이 아닙니다.");
        }
    }
}
