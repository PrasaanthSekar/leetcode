package com.leetcode.easy;

public class ConsecutiveCharacters {
    public static void main(String[] args) {
//        System.out.println(maxPower("leetcode"));
//        System.out.println(maxPower("hooraaaaaaaaaaay"));
        System.out.println(maxPower("c"));
    }

    public static int maxPower(String s) {
        int max = 0;
        int count = 1;
        char maxChar = s.charAt(0);
        char[] array = s.toCharArray();
        for (int i = 1; i < array.length; i++) {
            if (s.charAt(i) == maxChar) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
                maxChar = s.charAt(i);
            }
        }
        return Math.max(max, count);
    }
}
