package com.example.javaproject3.week2.day8;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.teacher = new Teacher();
        classInSchool.no = 1;
        classInSchool.teacher.age = 33;
        classInSchool.teacher.name = "김미미";
        classInSchool.teacher.address = "경기도 광주시";
        classInSchool.students = new Student[30];

        System.out.println(classInSchool.teacher.name);
        System.out.printf("%d반 담임 선생님 성함은 %s입니다.\n", classInSchool.no, classInSchool.teacher.name);
    }
}
