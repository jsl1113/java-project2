package com.example.javaproject3.week4.day15;

public class User {
        String name;
        String phoneNumber;
        int age;

        public User() {
        }

        public User(String name, String phoneNumber, int age) {
                this.name = name;
                this.phoneNumber = phoneNumber;
                this.age = age;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String getName() {
                return name;
        }



        public String getPhoneNumber() {
                return phoneNumber;
        }

        public int getAge() {
                return age;
        }

        boolean isAdult(){
            return age >= 18;
        }
}
