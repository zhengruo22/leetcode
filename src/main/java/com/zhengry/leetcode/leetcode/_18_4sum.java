package com.zhengry.leetcode.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Binary Search/Array
* @ClassName: _16_3sum_closest  
* @author zhengry  
* @date 2021年3月17日  
*
 */
public class _18_4sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if(nums == null || nums.length < 4) {
            return ret;
        }
        int len = nums.length;
        Arrays.sort(nums);
        
        for(int i = 0; i <= len - 4; i++) {
            if(i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            for(int j = i + 1; j <= len - 3; j++) {
                if(j > i + 1 && nums[j - 1] == nums[j]) {
                    continue;
                }
                int l = j + 1;
                int r = nums.length - 1;
                while(l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum == target) {
                        ret.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        while(l < r && nums[l] == nums[l+1]) {
                            l++;
                        }
                        l++;
                        while(l < r && nums[r] == nums[r - 1]) {
                            r--;
                        }
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return ret;
    }
    
    public static void main(String[] args) {
        _18_4sum demo = new _18_4sum();
        List<List<Integer>> ret = demo.fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0);
        ret.stream().forEach(s->{
            s.stream().forEach(System.out::print);
            System.out.println();
        });
    }
}
