package com.zhengry.leetcode.leetcode;

public class _23_Merge_k_Sorted_Lists {
    
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if(len == 0) {
            return new ListNode();
        }
        int[] idx = new int[len];
        for(int i = 0; i < len; i++) {
            idx[i] = 0;
        }
    }

    public static void main(String[] args) {
        _23_Merge_k_Sorted_Lists demo = new _23_Merge_k_Sorted_Lists();
    }

}
    