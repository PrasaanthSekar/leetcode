package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int len = 0;
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (charSet.add(s.charAt(i))){
                len++;
            }else{
                max = Math.max(max, len);
                len = 1;
                charSet.clear();
                charSet.add(s.charAt(i));
            }
        }
        return Math.max(max, len);
    }
}
