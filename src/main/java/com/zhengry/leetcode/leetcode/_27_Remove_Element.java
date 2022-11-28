package com.zhengry.leetcode.leetcode;

import java.util.Arrays;

public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int index = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] != val ) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        int[] nums =  {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
}
