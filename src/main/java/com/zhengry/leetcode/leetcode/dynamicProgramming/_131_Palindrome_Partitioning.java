package com.zhengry.leetcode.leetcode.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.
    
    A palindrome string is a string that reads the same backward as forward.
    
     
    
    Example 1:
    
    Input: s = "aab"
    Output: [["a","a","b"],["aa","b"]]
    Example 2:
    
    Input: s = "a"
    Output: [["a"]]
     
    
    Constraints:
    
    1 <= s.length <= 16
    s contains only lowercase English letters.
* @ClassName: _131_Palindrome_Partitioning  
* @author zhengry  
* @date 2021年1月21日  
*
 */

public class _131_Palindrome_Partitioning {

    public static void main(String[] args) {
        String s = "aabaffa";
        List<String> ret = partition(s);
        ret.stream().forEach(System.out::println);
    }
    
    /**
     * 
    * @Title: 理解错误  
    * @Description: TODO 
    * @param s
    * @return   
    * List<List<String>> 
    * @throws
     */
    public static List<String> partition(String s) {
        int len = s.length();
        boolean[][] d = new boolean[len][len];
        for(int i = 0; i < len; i++) {
            d[i][i] = true;
            if(i < len - 1) {
                d[i][i+1] = s.charAt(i) == s.charAt(i + 1);
            }
        }
        for(int i = 0; i < len; i++) {
            for(int j = 1; j < len; j++) {
                if(i+j < len && i-j >= 0) {
                    d[i-j][i+j] = d[i-j+1][i+j-1] && s.charAt(i-j) == s.charAt(i+j);
                }
                if(i+j < len && i-j+1 >= 0 && j>1) {
                    d[i-j+1][i+j] = d[i-j+2][i+j-1] && s.charAt(i-j+1) == s.charAt(i+j);
                }
            }
        }
        List<String> list = new ArrayList<>();
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(d[i][j]) {
                    list.add(s.substring(i, j + 1));
                }
            }
        }
        return list;
    }

}
