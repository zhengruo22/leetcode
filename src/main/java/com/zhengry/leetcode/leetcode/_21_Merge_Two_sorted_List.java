package com.zhengry.leetcode.leetcode;

public class _21_Merge_Two_sorted_List {
    
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode head = new ListNode();
        ListNode ret = head;
        
        while(l1 != null && l2 != null) {
            int v1 = l1.val;
            int v2 = l2.val;
            if(v1 < v2) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        if(l1 == null) {
            head.next = l2;
        } else {
            head.next = l1;
        }
        return ret.next;
    }
    
    public static void main(String[] args) {
        _21_Merge_Two_sorted_List demo = new _21_Merge_Two_sorted_List();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
