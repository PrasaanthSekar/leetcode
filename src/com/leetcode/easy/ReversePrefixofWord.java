package com.leetcode.easy;

public class ReversePrefixofWord {
    public static void main(String[] args) {
        System.out.println(reversePrefix("xyxzxe", 'z'));
    }

    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        // System.out.println(index);
        String prefix = word.substring(0, index + 1);
        StringBuilder builder = new StringBuilder(prefix);
        String reverse = builder.reverse().toString();
        StringBuilder result = new StringBuilder(reverse);
        result.append(word.substring(index + 1));
        return result.toString();
    }
}
