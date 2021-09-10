package com.leetcode.easy;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        // write your code here
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o', 'k'});

    }

    public static void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = s[i];
            s[i] = s[len - 1 - i];
            s[len - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
