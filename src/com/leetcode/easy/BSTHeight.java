package com.leetcode.easy;

public class BSTHeight {

    class Node {
        int val;
        Node left;
        Node right;
    }

    public static void main(String[] args) {

    }

    public static int maxHeight(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(maxHeight(node.left), maxHeight(node.right));
    }
}
