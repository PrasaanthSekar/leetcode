package com.leetcode.easy;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}));
        System.out.println(findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        System.out.println(findContentChildren(new int[]{1, 2}, new int[]{1, 2,3}));
    }

    public static int findContentChildren(int[] g, int[] s) {
//        Arrays.sort(g);
//        Arrays.sort(s);
        int count = 0;
        int gIndex = 0;
        int sIndex = 0;
        while (sIndex < s.length && gIndex < g.length) {
            if (g[gIndex] == s[sIndex]) {
                count++;
                gIndex++;
                sIndex++;
            } else if (g[gIndex] > s[sIndex]) {
                g[gIndex] = g[gIndex] - s[sIndex];
                sIndex++;
            } else {
                gIndex++;
                count++;
                sIndex++;
            }
        }
        return count;
    }
}
