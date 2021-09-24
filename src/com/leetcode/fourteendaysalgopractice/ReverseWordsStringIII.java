package com.leetcode.fourteendaysalgopractice;

import java.util.Arrays;

public class ReverseWordsStringIII {

    public static void main(String[] args) {
        String result = reverseWords("Let's take LeetCode contest");
        System.out.println(result);
    }

    public static String reverseWords(String s) {
        String[] splitString = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < splitString.length; i++) {
            result.append(reverseString(splitString[i].toCharArray()));
            if (i != splitString.length - 1) result.append(" ");
        }
        return result.toString();
    }

    public static String reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len / 2; i++) {
            if (s[i] != (s[len - i - 1])) {
                char temp = s[i];
                s[i] = s[len - i - 1];
                s[len - i - 1] = temp;
            }
        }
        return String.valueOf(s);
    }
}
