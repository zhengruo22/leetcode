package com.zhengry.leetcode.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Deep-first-search 递归
* @ClassName: _17_Letter_Combinations_of_a_Phone_Number  
* @author zhengry  
* @date 2021年3月17日  
*
 */
public class _17_Letter_Combinations_of_a_Phone_Number {
    public static List<String> letterCombinations(String digits) {
        Map<Character, List<String>> map = new HashMap<Character, List<String>>() {
            {
                put('2', Arrays.asList("a", "b", "c"));
                put('3', Arrays.asList("d", "e", "f"));
                put('4', Arrays.asList("g", "h", "i"));
                put('5', Arrays.asList("j", "k", "l"));
                put('6', Arrays.asList("m", "n", "o"));
                put('7', Arrays.asList("p", "q", "r", "s"));
                put('8', Arrays.asList("t", "u", "v"));
                put('9', Arrays.asList("w", "x", "y", "z"));
            }
        };
        List<String> ret = new ArrayList<String>();
        if(digits == null || digits.length() == 0) {
            return ret;
        }
        for(int i = 0; i < digits.length(); i++) {
            char s = digits.charAt(i);
            List<String> di = map.get(s);
            List<String> ret_tmp = new ArrayList<>();
            if(!ret.isEmpty()) {
                for(String pre: ret) {
                    for(String curret: di) {
                        ret_tmp.add(pre + curret);
                    }
                }
                ret = ret_tmp;
            } else {
                ret.addAll(di);
            }
        }
        return ret;
    }
    private List<String> l = new ArrayList<String>();
    
    Map<Character, List<String>> map = new HashMap<Character, List<String>>() {
        {
            put('2', Arrays.asList("a", "b", "c"));
            put('3', Arrays.asList("d", "e", "f"));
            put('4', Arrays.asList("g", "h", "i"));
            put('5', Arrays.asList("j", "k", "l"));
            put('6', Arrays.asList("m", "n", "o"));
            put('7', Arrays.asList("p", "q", "r", "s"));
            put('8', Arrays.asList("t", "u", "v"));
            put('9', Arrays.asList("w", "x", "y", "z"));
        }
    };
    
    public List<String> letterCombinations2(String digits) {
        if(digits == null || digits.length() == 0) {
            return l;
        }
        letter(digits, 0, "");
        
        return l;
    }
    
    public void letter(String digits, int index, String res) {
        if(index == digits.length()) {
            l.add(res);
            return;
        }
        char c = digits.charAt(index);
        for(String s: map.get(c)) {
            letter(digits, index + 1, res + s);
        }
    }
    
    public static void main(String[] args) {
        letterCombinations("23").stream().forEach(System.out::println);
        _17_Letter_Combinations_of_a_Phone_Number demo = new _17_Letter_Combinations_of_a_Phone_Number();
        demo.letterCombinations2("23").forEach(System.out::println);
    }
}
