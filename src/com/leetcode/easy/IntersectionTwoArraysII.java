package com.leetcode.easy;

import java.util.Arrays;

public class IntersectionTwoArraysII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int num1Len = nums1.length;
        int num2Len = nums2.length;

        int[] res;
        res = (num1Len < num2Len) ? new int[num1Len] : new int[num2Len];
        int index = 0;
        while (index < Math.min(num1Len, num2Len)) {

            index++;
        }
        return res;
    }
}
