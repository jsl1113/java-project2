package com.example.javaproject3.week4.day17;

import java.io.IOException;

public class RightTrianglePrinter {
    private Printer printer;

    public RightTrianglePrinter(Printer printer) {
        this.printer = printer;
    }

    public String makeALine(int h, int i){
        return String.format("%s%s\n", "", "*".repeat(i));
    }

   // 모양 출력하기 & 모양 만들기
   public void printShape(int h) throws IOException {
        String[] lines = new String[h];
        for(int i=0; i<h; i++){
            lines[i] = makeALine(h, i);
        }
       printer.print(lines);
   }
    public static void main(String[] args) throws IOException {
        RightTrianglePrinter rtp = new RightTrianglePrinter(new FilePrinter());
        rtp.printShape(5);
        RightTrianglePrinter rtp1 = new RightTrianglePrinter(new ConsolePrinter());
        rtp1.printShape(7);
    }
}
