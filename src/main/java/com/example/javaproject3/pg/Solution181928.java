package com.example.javaproject3.pg;

public class Solution181928 {
    public int solution(int[] num_list) {
        String even = "", odd = "";
        for(int num : num_list){
            if(num %2 == 0) even += num;
            else odd += num;
        }
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
    public static void main(String[] args) {

    }
}
