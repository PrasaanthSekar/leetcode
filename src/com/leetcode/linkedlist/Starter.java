package com.leetcode.linkedlist;

public class Starter {
    public static void main(String[] args) {
        LinkedListCustom list = new LinkedListCustom();
        list.addSorted(14.0);
        list.addSorted(12.0);
        list.addSorted(13.0);
        list.addSorted(18.0);
        list.addSorted(16.0);

        list.print();
    }
}
