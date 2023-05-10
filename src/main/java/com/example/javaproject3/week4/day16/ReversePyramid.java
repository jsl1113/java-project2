package com.example.javaproject3.week4.day16;

public class ReversePyramid {
    private String spaceChar = "0";
    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    // 메소드로 핵심 기능 분리
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(2 * (h - i) - 1));
    }

    public String makeParallelogramALine(int h, int i){
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(h));
    }

    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid("#");
        int h = 4;
        for (int i = 0; i < h; i++) {
            // 기존 로직을 method 하게 변경
            System.out.print(reversePyramid.makeALine(h, i));
        }
    }
}
