package com.leetcode.easy;

import java.util.Arrays;

public class SortArrayParityII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4, 2, 7, 5})));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int len = nums.length;
        int start = 0;
        int last = len - 1;
        while (start < last) {
            if (start % 2 != 0) {

            }
        }
        return nums;
    }
}
