package com.example.javaproject3.week4.day15;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("이지선");
        user.setAge(25);

        System.out.printf("%s은 성인입니까? %s\n", user.name, user.isAdult());
    }
}
