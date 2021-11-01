package com.leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCustom {

    ListNode head;

    public void add(double temperature) {
        ListNode node = new ListNode();
        node.val = temperature;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            ListNode last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    public void addSorted(double temperature) {
        ListNode node = new ListNode();
        node.val = temperature;
        node.next = null;

        if (head == null || head.val >= temperature) {
            node.next = head;
            head = node;
        } else {
            ListNode current = head;
            while (current.next != null && current.next.val < temperature) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;

        }
    }

    public void delete(double temperature) {
        ListNode node = head;

        if (node.val == temperature) {
            head = node.next;
        } else {
            while (node.next != null && node.next.val != temperature) {
                node = node.next;
            }
            if (node.next != null)
                node.next = node.next.next;
        }
    }

    public void insertAfter(int pos, double val) {
        ListNode node = new ListNode();
        node.val = val;
        node.next = null;

        int index = 1;
        ListNode current = head;
        while (index != pos) {
            current = current.next;
            index++;
        }
        node.next = current.next;
        current.next = node;
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        Set<Double> data = new HashSet<>();

        while(head != null){
            if(!data.contains(head.val)){
                node.next = head;
                    node = node.next;
                data.add(head.val);
            }
            head = head.next;
        }
        return node;
    }

    public void print() {
        ListNode node = head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
