package com.example.javaproject3.pg;

import java.util.*;
import java.util.stream.Collectors;

public class Solution120852 {
    public int[] solution(int n) {
        int[] answer = {};
        int[] tmp = new int[n/2];
        int num = 2, idx = 0;
        boolean flag = false;
        while(n != 1){
            while(isPrime(num) && n%num == 0){
                tmp[idx] = num;
                n /= num;
                flag = true;
            }
            num++;
            if(flag) {
                idx++;
                flag = false;
            }
        }
        answer = new int[idx];
        for(int i=0; i<idx;i++) answer[i] = tmp[i];
        return answer;
    }

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i*i <= n; i++){
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Solution120852 solution120852 = new Solution120852();
        int[] answer = solution120852.solution(420);
        System.out.println(Arrays.toString(answer));
    }
}
