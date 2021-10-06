package com.leetcode.easy;

public class MinimumMovesConvertString {
    public static void main(String[] args) {
        System.out.println(minimumMoves("XXOX"));
    }

    public static int minimumMoves(String s) {
        int count = 0;
        int end = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).contains("X")) {
                count++;
            }
        }
        return count;
    }
}
