package com.example.javaproject3.week4.day17;

import java.io.*;
import java.util.*;
public class DrawDiamond {
    public static String makeALine(int h, int i){
        int pivot  = h / 2;
        if (i <= pivot) {
            // 피라미드 로직
            return String.format("%s%s\n", getRepeatedSymbol("0", -2 + h - i - 2), getRepeatedSymbol("*", 2 * i + 1));
        } else {
            // 역 피라미드 로직
            return  String.format("%s%s\n", getRepeatedSymbol("0", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
        }
    }
    public static String getRepeatedSymbol(String symbol, int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) sb.append(symbol);
        return sb.toString();
    }

    public static void printFile(StringBuilder sb){
        try {
            FileWriter writer = new FileWriter("Diamond.txt");
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류가 발생하였습니다.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        int h = 7;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < h; i++) {
            sb.append(makeALine(h, i));
//            System.out.print(makeALine(h, i));
        }
        printFile(sb);
    }
}
