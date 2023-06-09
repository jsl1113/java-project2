package com.example.javaproject3.week4.day15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StairsStar {
    public static void main(String[] args) throws IOException {
        int height = 5;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<height; i++){
            for(int j=0; j<i; j++) bw.append(" ");
            bw.append("**\n");
        }
        bw.flush();
        bw.close();
    }
}
