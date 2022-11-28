package com.zhengry.leetcode.leetcode;

public class _35_Search_Insert_Position {

    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,6};
        _35_Search_Insert_Position instance = new _35_Search_Insert_Position();
        System.out.println(instance.searchInsert(nums, 2));
        String s = "hello world   ";
        char[] st = s.toCharArray();
        int count = 0;
        for(int i = st.length - 1; i >= 0; i--) {
            if(st[i] == ' ') {
                if(count != 0) {
                    break;
                }
                
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
    
    public int searchInsert(int[] nums, int target) {
        return search(0, nums.length - 1, nums, target);
    }
    
    int search(int i, int j, int[] nums, int target) {
        while(i <= j) {
            int k = (i + j) / 2;
            if(nums[k] < target) {
                i = k + 1;
            } else if(nums[k] > target) {
                j = k - 1;
            } else {
                return k;
            }
        }
        return i;
    }
}
