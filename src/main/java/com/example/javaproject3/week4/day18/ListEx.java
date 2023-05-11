package com.example.javaproject3.week4.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        List l2 = new ArrayList();

        l1.add("1");
        l1.add("2");
        l1.add("Hello");
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());


        for (var item : l2) {
//            System.out.println(item.split());
        }
    }
}
