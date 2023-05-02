package com.example.javaproject3.week3.day12;

public class ZeroOrFive {
    public static boolean isZeroOrFive(int num){
        while(num > 0){
            if(num % 10 != 5 && num % 10 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public int[] solution(int l, int r) {
        int[] answer = {-1};
        int[] result = new int[(r-l)/5];
        int idx = 0;
        for(int i=l; i<=r; i++){
            if(isZeroOrFive(i)) result[idx++] = i;
        }
        if(idx == 0) return answer;
        else {
            answer = new int[idx];
            for(int i=0; i<idx; i++) answer[i] = result[i];
            return answer;
        }
    }
    public static void main(String[] args) {
        int num = 252;

        // 10으로 나눈 나머지가 5로 나누었을 때 0 or 5인지 check
        isZeroOrFive(num);
    }
}
