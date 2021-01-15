package com.zhengry.leetcode.leetcode.dynamicProgramming;

public class _1025_divisor_game {
    public boolean divisorGame(int N) {
        boolean[] ret = new boolean[N + 1];
        if(N == 1) {
            return false;
        }
        ret[1] = false;
        for(int i = 1; i <= N; i ++) {
            ret[i] = false;
            for(int j = 1; j < i; j++) {
                if(i % j == 0 && !ret[i - j]) {
                    ret[i] = true;
                }
            }
            
        }
        return ret[N];
    }
    
    public static void main(String[] args) {
        int N = 5;
        _1025_divisor_game test = new _1025_divisor_game();
        System.out.println(test.divisorGame(N));
    }
}
