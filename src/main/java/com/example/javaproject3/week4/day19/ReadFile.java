package com.example.javaproject3.week4.day19;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile implements getLine {

    @Override
    public List<String> getLines(String fileName) throws IOException {
        List<String>lines = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName, Charset.forName("UTF-8")));
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }
}
