package com.zhengry.leetcode.leetcode;

import java.util.Arrays;

public class _26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        int index = 1;
        for(int i = 1; i < length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[index] = nums[i];
                index ++;
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        int[] nums =  {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
