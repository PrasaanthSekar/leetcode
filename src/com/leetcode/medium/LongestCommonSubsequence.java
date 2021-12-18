package com.leetcode.medium;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
//        System.out.println(longestCommonSubsequence("abcde", "ace"));
        System.out.println(longestCommonSubsequence("oxcpqrsvwf", "shmtulqrypy"));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int index1 = 0;
        int index2 = 0;
        int len = 0;
        while (index1 != text1.length()) {
            char curr = text1.charAt(index1);
            for (int i = index2; i < text2.length(); i++) {
                if (curr == text2.charAt(i)) {
                    len++;
                    index2 = i + 1;
                    break;
                }
            }
            index1++;
        }
        return len;
    }
}
