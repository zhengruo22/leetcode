package com.zhengry.leetcode.leetcode.dynamicProgramming;

public class _53_maximum_subarray {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i = 1 ; i < nums.length; i++) {
            nums[i] += nums[i-1] > 0? nums[i-1] : 0;
            max = Math.max(nums[i], max);
        }
        return max;
    }
    
    
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        _53_maximum_subarray test = new _53_maximum_subarray();
        System.out.println(test.maxSubArray(nums));
    }

}
