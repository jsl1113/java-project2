package com.example.javaproject3.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User sseni = new User();
        sseni.name = "이지선";
        sseni.phoneNumber = "010-0000-1234";
        sseni.age = 25;

        User user1 = new User();
        user1.name = "가나다";
        user1.phoneNumber = "010-0000-1235";
        user1.age = 30;
        System.out.printf("%s님은 성인인가요? %s\n", sseni.name, sseni.isAdult());
        System.out.printf("%s님은 성인인가요? %s\n", user1.name, user1.isAdult());
    }
}
