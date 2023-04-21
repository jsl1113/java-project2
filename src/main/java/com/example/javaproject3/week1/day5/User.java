package com.example.javaproject3.week1.day5;

public class User {
    String name;
    String phoneNumber;
    int age;

    boolean isAdult(){  // 성인인지 여부를 알려주는 메소드
        return age >= 20;
    }
}
