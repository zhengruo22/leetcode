package com.zhengry.leetcode.leetcode.dynamicProgramming;

public class _85_maximal_rectangle {
    public int maximalRectangle(char[][] matrix) {
        int max = 0;
        return max;
    }
    
    public static void main(String[] args) {
        char[][] a = {
                      {'1','0','1','0','0'},
                      {'1','0','1','1','1'},
                      {'1','1','1','1','1'},
                      {'1','0','0','1','0'}
                    };
        _85_maximal_rectangle test = new _85_maximal_rectangle();
        System.out.println(test.maximalRectangle(a));
    }
}
