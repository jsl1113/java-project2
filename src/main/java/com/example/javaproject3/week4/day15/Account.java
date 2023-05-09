package com.example.javaproject3.week4.day15;

public class Account {
    int balance = 2000;
    public boolean isSufficient(){
        return balance >= 1500;
    }

    public void printIsSufficient(){
        System.out.println("잔액이 충분합니다.");
    }
}
