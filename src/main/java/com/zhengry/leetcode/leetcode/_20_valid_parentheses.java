package com.zhengry.leetcode.leetcode;

import java.util.Stack;

public class _20_valid_parentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char lastC = stack.pop();
                if(lastC == '(' && c == ')') {
                    continue;
                }
                if(lastC == '[' && c == ']') {
                    continue;
                }
                if(lastC == '{' && c == '}') {
                    continue;
                }
                return false;
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
        
    }
    
    public static void main(String[] args) {
        _20_valid_parentheses demo = new _20_valid_parentheses();
        System.out.println(demo.isValid("{[]}"));
    }
}
