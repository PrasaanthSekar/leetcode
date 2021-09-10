package com.leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        // write your code here
        String[] array = new String[]{"cir", "car"};
        String result = longestCommonPrefix(array);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String result = strs[0];
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            for (String str : strs) {
                if (result.equals(str.substring(0, result.length()))) {
                    count++;
                }
            }
            if (count == strs.length)
                return result;
            else {
                result = result.substring(0, result.length() - 1);
                count = 0;
                i=0;
            }
        }
        return "";
    }
}
