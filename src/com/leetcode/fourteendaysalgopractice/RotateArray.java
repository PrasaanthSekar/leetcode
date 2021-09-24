package com.leetcode.fourteendaysalgopractice;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        // write your code here
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 1);
    }

    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] res = new int[len];
        if (k == 0) System.arraycopy(nums, 0, res, 0, res.length);
        if (k > len) k = k % len;
        if (k % len != 0) {
            for (int i = 0; i < len; i++) {
                if (i + k > len - 1) {
                    res[(i + k) - len] = nums[i];
                } else {
                    res[i + k] = nums[i];
                }
            }
            System.arraycopy(res, 0, nums, 0, res.length);
        }
        System.out.println(Arrays.toString(nums));
    }
}
