package com.example.javaproject3.week1;

import java.io.IOException;

public class JavaInputTest {
    public static void main(String[] args) throws IOException {
        // JavaInput 타입으로 변수 선언하고 인스턴스화하며 초기화
        JavaInput javaInput = new JavaInput();

        // .readAChar() 메소드 호출
        javaInput.readTwoChars();
    }
}
