package com.example.javaproject3.week5.day22;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack01 {
    private int[] arr = new int[10000];
    private int pointer = 0;

    public void push(int value) {
        this.arr[pointer++] = value;
        System.out.println("pointer = " + pointer);
    }

    public int pop() {
        if (!isEmpty()) return this.arr[--pointer];
        else throw new EmptyStackException();
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return arr[pointer - 1];
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public static void main(String[] args) {
        Stack01 st = new Stack01();
        st.push(10);
        st.push(20);
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
