package com.example.javaproject3.week4.day17;

public class HelloPrinter {
    Printer2 printer2;
    public void print(String message){
        System.out.println(message);
    }

    public void repeatMessage(int n, String message){
        for(int i=0; i<n; i++){
            print(message);
        }
    }
    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter();
        hp.print("Hello");
        hp.repeatMessage(5, "Hi");
    }
}
