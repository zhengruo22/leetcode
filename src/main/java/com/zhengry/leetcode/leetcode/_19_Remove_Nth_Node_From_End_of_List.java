package com.zhengry.leetcode.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _19_Remove_Nth_Node_From_End_of_List {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ret = head;
        List<ListNode> list = new ArrayList<>();
        while(ret != null) {
            list.add(ret);
            ret = ret.next;
        }
        int len = list.size();
        if(n == len) {
            head = head.next;
        } else if(n == 1) {
            list.get(len - n - 1).next = null;
        } else {
            list.get(len - n - 1).next = list.get(len - n + 1);
        }
        return head;
    }
    
    public static void main(String[] args) {
        _19_Remove_Nth_Node_From_End_of_List demo = new _19_Remove_Nth_Node_From_End_of_List();
        
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
