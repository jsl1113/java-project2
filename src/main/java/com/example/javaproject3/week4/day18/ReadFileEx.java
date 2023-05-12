package com.example.javaproject3.week4.day18;

import com.example.javaproject3.week4.day19.ReadFile;
import com.example.javaproject3.week4.day19.getLine;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ReadFileEx {
    getLine getLines;

    public ReadFileEx(getLine getLines) {
        this.getLines = getLines;
    }

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\jsl11\\바탕 화면\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\1.병원정보서비스 2022.10_utf-8.csv";
        ReadFileEx readFile = new ReadFileEx(new ReadFile());
        List<String> result = readFile.getLines.getLines(filePath);
        System.out.println(result.get(0));
    }

}
