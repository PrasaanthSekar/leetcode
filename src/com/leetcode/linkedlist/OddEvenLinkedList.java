package com.leetcode.linkedlist;

public class OddEvenLinkedList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        oddEvenList(node1);
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;

        ListNode result = new ListNode(0);
        ListNode temp = result;

        while (odd.next != null) {
            System.out.println(odd.val);
            temp.next = odd;
            odd = odd.next.next;
            temp = temp.next;
        }
        while (even.next != null) {
            temp.next = even;
            even = even.next.next;
            temp = temp.next;
        }
        return result.next;
    }
}
