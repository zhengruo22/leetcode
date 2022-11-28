package com.zhengry.leetcode.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _90_Subsets_II {
    
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> ret = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        helper(0, nums);
        return ret;
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper2(0, nums);
        System.out.println(ret);
        return ret;
    }
    
    private void helper(int idx, int[] nums) {
        if(idx == nums.length) {
            ret.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[idx]);
        helper(idx + 1, nums);
        list.remove(list.size() - 1);
        helper(idx + 1, nums);
    }
    
    private void helper2(int idx, int[] nums) {
        ret.add(new ArrayList<>(list));
        for(int i = idx; i < nums.length; i++) {
            if(i != idx && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            helper2(i + 1, nums);
            list.remove(list.size() - 1);
        }
        
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        _90_Subsets_II t = new _90_Subsets_II();
        t.subsetsWithDup(nums);
    }
}
