package com.zhengry.leetcode.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _22_Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        int l = n;
        int r = n;
        List<String> ret = new ArrayList<>();
        generate("", l, r, ret);
        return ret;
    }
    
    private void generate(String s, int l, int r, List<String> ret) {
        if(l == 0 && r == 0) {
            ret.add(s);
        } else if(l > 0 && r > 0) {
            if(l<r) {
                generate(s + "(", l - 1, r, ret);
                generate(s + ")", l, r - 1, ret);
            } else {
                generate(s + "(", l - 1, r, ret);
            }
        } else if(l == 0) {
            generate(s + ")", l, r - 1, ret);
        } else {
            generate(s + "(", l - 1, r, ret);
        }
    }

    public static void main(String[] args) {
        _22_Generate_Parentheses demo = new _22_Generate_Parentheses();
        List<String> ret = demo.generateParenthesis(3);
        ret.stream().forEach(System.out::println);
    }
}
