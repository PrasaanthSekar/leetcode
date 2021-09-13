package com.leetcode.easy;

public class ReverseWordsStringIII {

    public static void main(String[] args) {
        // write your code here
        String result = reverseWords("Let's take LeetCode contest");
        System.out.println(result);
    }

    public static String reverseWords(String s) {
        String[] resArray = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < resArray.length; i++) {
            StringBuilder rev = new StringBuilder(resArray[i]);
            result.append(rev.reverse());
            if (i != resArray.length - 1)
                result.append(" ");
        }
        return result.toString();
    }
}
