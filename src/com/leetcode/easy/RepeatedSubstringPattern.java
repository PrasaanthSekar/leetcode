package com.leetcode.easy;

public class RepeatedSubstringPattern {

    public static void main(String[] args) {
        // write your code here
        boolean result = repeatedSubstringPatternMe("aba");
        System.out.println(result);
    }

    public static boolean repeatedSubstringPatternMe(String str) {
        int len = str.length();
        int half = len / 2;
        while (half != 0) {
            if (len % half == 0) {
                int repeat = len / half;
                String sub = str.substring(0, half);
                if (sub.repeat(repeat).equals(str))
                    return true;
            }
            half--;
        }
        return false;
    }

    public static boolean repeatedSubstringPattern1(String str) {
        int len = str.length();
        for (int i = len / 2; i >= 1; i--) {
            if (len % i == 0) {
                int repeat = len / i;
                String subS = str.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < repeat; j++) {
                    sb.append(subS);
                }
                if (sb.toString().equals(str)) return true;
            }
        }
        return false;
    }

    public static boolean repeatedSubstringPattern(String s) {
        String sub = "" + s.charAt(0);
        while (sub.length() != s.length()) {
            int jump = sub.length();
//            String current = s.substring(0, jump);
            for (int j = jump; j < s.length(); j += jump) {
                if (j + jump <= s.length()) {
                    String newStr = s.substring(j, j + jump);
                    if (!sub.equals(newStr)) {
                        break;
                    }
                    if (j == s.length() - sub.length()) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
            sub = s.substring(0, sub.length() + 1);
            if (sub.length() == s.length()) return false;
        }
        return false;
    }
}
