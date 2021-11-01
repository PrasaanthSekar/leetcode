package com.leetcode.medium;

import java.util.Arrays;

public class SingleNumberIII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumber(new int[]{1, 2, 1, 3, 2, 5})));
    }

    public static int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        // 1 1 2 2 3 5
        int count = 1;
        int prev = nums[0];
        int[] result = new int[2];
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (prev == nums[i]) {
                count++;
            } else {
                if (count != 2) {
                    result[index] = prev;
                    index++;
                }
                prev = nums[i];
                count = 1;
            }
        }
        if(count != 2) result[index] = prev;
        return result;
    }
}
