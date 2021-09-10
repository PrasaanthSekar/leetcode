package com.leetcode.easy;

public class ImplementstrStr {

    public static void main(String[] args) {
        // write your code here
        int result = strStr("a",
                "a");
        System.out.println(result);
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() == 0 && needle.length() == 0) return 0;
        else if (needle.length() == 0) return 0;
        int needleLen = needle.length();
        if (needleLen > haystack.length()) return -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (i + needleLen <= haystack.length()) {
                    if (haystack.substring(i, (i) + needleLen).equals(needle)) {
                        return i;
                    }
                }

            }
        }
        return -1;
    }
}
