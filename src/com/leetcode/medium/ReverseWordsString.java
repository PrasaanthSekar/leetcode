package com.leetcode.medium;

public class ReverseWordsString {
    public static void main(String[] args) {
        String result = reverseWords("  hello world  ");
        System.out.println(result);
    }

    public static String reverseWords(String s) {
        String[] resArray = s.strip().trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = resArray.length - 1; i >= 0; i--) {
            if (!resArray[i].equals("")) {
                result.append(resArray[i]);
                if (i != 0) result.append(" ");
            }
        }
        return result.toString();
    }
}
