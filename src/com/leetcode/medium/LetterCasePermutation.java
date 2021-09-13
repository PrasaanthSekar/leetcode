package com.leetcode.medium;

import java.util.*;

public class LetterCasePermutation {

    public static void main(String[] args) {
        // write your code here
        List<String> result = letterCasePermutation("mQe");
        System.out.println(result);
    }

    //a1b1
    public static List<String> letterCasePermutation(String s) {
        Set<String> result = new HashSet<>();
        result.add(s.toUpperCase());
        result.add(s.toLowerCase());
        result.add(s);
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122 || s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                StringBuilder upper = new StringBuilder(s);
                upper.replace(i, i + 1, s.substring(i, i + 1).toUpperCase());
                result.add(upper.toString());
                upper.replace(i, i + 1, s.substring(i, i + 1).toLowerCase());
                result.add(upper.toString());
            }
        }
        return new ArrayList<>(result);
    }
}
