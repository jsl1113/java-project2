package com.example.javaproject3.week1.day4;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException {
        // InputStreamReader 라는 클래스를 is 라는 이름으로 선언
        InputStreamReader is;

        // InputStreamReader 를 인스턴스화
        is = new InputStreamReader(System.in);

        // InputStreamReader 에서 한 글자를 읽어 옴
        int asciiCode = is.read();

        // 읽어 온 문자열 코드를 출력
        System.out.println(asciiCode);

    }

    public void readTwoChars() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int asciiCode1 = is.read();
        int asciiCode2 = is.read();
        System.out.println(asciiCode1);
        System.out.println(asciiCode2);
    }
}
