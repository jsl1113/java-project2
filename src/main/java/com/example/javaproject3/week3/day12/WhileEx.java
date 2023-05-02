package com.example.javaproject3.week3.day12;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WhileEx {
    public static void main(String[] args) throws InterruptedException {
        while(true){
            System.out.println(LocalDateTime.now());
            Thread.sleep(1000);
        }
    }
}
