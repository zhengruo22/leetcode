package com.zhengry.leetcode.leetcode.dynamicProgramming;

public class _392_is_subsequence {
    public boolean isSubsequence(String s, String t) {
        int i = -1;
        for(char c : s.toCharArray()) {
            i = t.indexOf(c, i + 1);
            if(i==-1) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s= "leeeeetcode";
        String t = "yyyyylyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy";
        _392_is_subsequence test = new _392_is_subsequence();
        System.err.println(test.isSubsequence(s, t));
    }
}
