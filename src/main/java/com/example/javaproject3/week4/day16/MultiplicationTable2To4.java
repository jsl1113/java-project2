package com.example.javaproject3.week4.day16;

public class MultiplicationTable2To4 {
    private String multipleSymbol;

    public MultiplicationTable2To4(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public void printMultiplicationTable(int n){
        for(int i=0; i<=9; i++){
            System.out.printf("%d %s %d = %d\n", n, multipleSymbol, i, n * i);
        }
    }
    public static void main(String[] args) {
        MultiplicationTable2To4 multiplicationTable2To4 = new MultiplicationTable2To4("x");
        multiplicationTable2To4.printMultiplicationTable(2);
        MultiplicationTable2To4 multiplicationTable2To41 = new MultiplicationTable2To4("*");
        multiplicationTable2To41.printMultiplicationTable(5);
    }
}
