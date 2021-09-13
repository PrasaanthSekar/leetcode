package com.leetcode.easy;

public class ReverseStringII {

    public static void main(String[] args) {
        // write your code here
        String result = reverseStr("abcdefg", 3);
        System.out.println(result);
    }

    public static String reverseStr(String s, int k) {
        int len = s.length();
        if (len < k) return new StringBuilder(s).reverse().toString();
        StringBuilder result = new StringBuilder();
        boolean isReverse = true;
        for (int i = 0; i < s.length(); i += k) {
            StringBuilder rev;
            if (i + k < len)
                rev = new StringBuilder(s.substring(i, i + k));
            else
                rev = new StringBuilder(s.substring(i, len));
            if (isReverse) {
                result.append(rev.reverse());
                isReverse = false;
            } else {
                result.append(rev);
                isReverse = true;
            }
        }
        return result.toString();
    }
}
