package com.example.javaproject3.pg;

import com.example.javaproject3.psstudy.Solution12949;
import com.example.javaproject3.psstudy.Solution81302;

public class Solution12943 {
    public int solution(int num) {
        int answer = 0, testCase = 0;

        while (num != 1) {
            if (testCase == 500) return -1;
            if (num % 2 == 0) {
                num /= 2;
                answer++;
            } else if (num % 2 == 1) {
                num *= 3;
                num++;
                answer++;
            }
            if (num == 1) break;
            else testCase++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution12943 solution12943 = new Solution12943();
        System.out.println(solution12943.solution(6));
    }
}
