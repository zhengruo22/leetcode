package com.zhengry.leetcode.leetcode.dynamicProgramming;

public class _70_climbing_stairs {
    
    public int climbStairs(int n) {
        int[] nums = new int[n + 1];
        if(n == 0 || n == 1) {
            return 1;
        }
        nums[0]=1;
        nums[1]=1;
        for(int i = 2; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }
    
    public static void main(String[] args) {
        int n = 44;
        _70_climbing_stairs test = new _70_climbing_stairs();
        System.out.println(test.climbStairs(n));
    }
}
