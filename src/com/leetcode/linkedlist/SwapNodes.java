package com.leetcode.linkedlist;

public class SwapNodes {

    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode first = null;
        ListNode last = null;
        int pos = 0;
        int size = 0;
        while(pos != k-1){
            pos++;
            fast = fast.next;
        }
        first = fast;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
            pos++;
        }
        last = slow;
        System.out.println(pos);
        ListNode result = head;
        while (result != null){
            if(result.next == first){
                last.next = result.next.next;
                result.next = last;
            }
            if(result.next == last){
                first.next = result.next.next;
                result.next = first;
            }
            result = result.next;
        }
        return result;
    }
}
