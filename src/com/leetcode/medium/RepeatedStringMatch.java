package com.leetcode.medium;

public class RepeatedStringMatch {
    public static void main(String[] args) {

        int result = repeatedStringMatch("aa", "a");
        System.out.println(result);
    }

    public static int repeatedStringMatch(String a, String b) {
        if (b.equals("")) return 0;
        if (a.equals(b)) return 1;
//        if (!b.contains(a)) return -1;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (a.repeat(i).contains(b)) return i;
        }
        return -1;
    }
}
