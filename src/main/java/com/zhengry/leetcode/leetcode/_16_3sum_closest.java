package com.zhengry.leetcode.leetcode;

import java.util.Arrays;

/**
 * Binary Search/Array
* @ClassName: _16_3sum_closest  
* @author zhengry  
* @date 2021年3月17日  
*
 */
public class _16_3sum_closest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int len = nums.length;
        int ret = 0;
        for(int i = 0; i < len; i ++) {
            int h = len - 1;
            int l = i + 1;
            if(l == len) {
                break;
            }
            while(l < h) {
                int sum = nums[i] + nums[l] + nums[h];
                if(sum == target) {
                    return sum;
                }
                int diff = sum > target? sum - target: target - sum;
                if(diff < min) {
                    min = diff;
                    ret = sum;
                }
                if(sum < target) {
                    l++;
                } else {
                    h--;
                }
            }
        }
        return ret;
    }
    
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
