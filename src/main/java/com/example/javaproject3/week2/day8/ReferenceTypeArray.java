package com.example.javaproject3.week2.day8;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] student = new Student[2];  // new 를 써서 클래스를 인스턴스로
        student[0] = new Student();
        student[0].name = "이지선";
        student[0].phoneNumber = "010-1234-5678";
        student[0].age = 25;

        student[1] = new Student();
        student[1].name = "가나다";
        student[1].phoneNumber = "010-1111-1111";
        student[1].age = 2;
    }
}
