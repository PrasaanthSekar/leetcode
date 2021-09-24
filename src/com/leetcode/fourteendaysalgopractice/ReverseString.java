package com.leetcode.fourteendaysalgopractice;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        reverseString(new char[]{'l', 'o'});
    }

    public static void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len / 2; i++) {
            if (s[i] !=(s[len - i - 1])) {
                char temp = s[i];
                s[i] = s[len - i - 1];
                s[len - i - 1] = temp;
            }
        }
        System.out.println(Arrays.toString(s));
    }
}
