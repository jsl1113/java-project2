package com.example.javaproject3.week4.day19;

import com.example.javaproject3.week4.day18.Address;
import com.example.javaproject3.week4.day18.Hospital;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.*;

public class ReadFileEx {
    LineReader linesReader;
    Charset charset;
    public ReadFileEx(LineReader linesReader, Charset charset) {
        this.linesReader = linesReader;
        this.charset = charset;
    }

    public Hospital parse(String str){
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines){
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }
    public static void main(String[] args) throws IOException {
//        String filePath = "C:\\Users\\jsl11\\바탕 화면\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\1.병원정보서비스 2022.10_utf-8.csv";
        ReadFileEx readFile = new ReadFileEx(new FileReader("hospital_Info_10lines.csv"), Charset.forName("UTF-8"));
        List<String> strLines = readFile.linesReader.getLines();
        readFile.parse(strLines.get(0));
        List<Hospital> parsedHospital = readFile.getHospitals(strLines);
        for(int i=0; i<9; i++){
            Hospital hospital = parsedHospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(),
                    hospital.getAddress().getFullAddr());
        }
    }

}
