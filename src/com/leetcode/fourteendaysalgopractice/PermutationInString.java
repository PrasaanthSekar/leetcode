package com.leetcode.fourteendaysalgopractice;

public class PermutationInString {

    public static void main(String[] args) {
        // write your code here
        boolean result = checkInclusion("ab", "eidboaoo");
        System.out.println(result);
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() == 0) return false;
        int index = s1.length();
        while (index > 0) {
            for (int i = 0; i <= s1.length() - index; i++) {
                String temp = s1.substring(i, i + index);
                if (s2.contains(temp)) {
                    return true;
                }
            }
            index--;
        }
        return false;
    }
}
