package com.example.javaproject3.week4.day19;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class FileReader implements LineReader {
    private String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<String> getLines() throws IOException {
        List<String>lines = new LinkedList<>();
        // BufferedReader 선언 -> File 연결
        BufferedReader br = new BufferedReader(new java.io.FileReader(fileName, Charset.forName("UTF-8")));

        // BufferedReader로 file 한 줄씩 읽어서 저장하기
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }
}
