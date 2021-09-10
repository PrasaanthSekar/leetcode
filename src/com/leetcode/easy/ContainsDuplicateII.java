package com.leetcode.easy;

import java.util.LinkedHashSet;
import java.util.Set;

public class ContainsDuplicateII {

    public static void main(String[] args) {
        // write your code here
        boolean result = containsNearbyDuplicate1(new int[]{1, 0, 1, 1}, 1);
        System.out.println(result);
    }

    public static boolean containsNearbyDuplicate1(int[] nums, int k) {
        Set<Integer> numSet = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numSet.add(nums[i])) {
                int index = findIndex(nums[i], i, nums);
                if (Math.abs(index - i) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int findIndex(int num, int maxIndex, int[] nums) {
        int index = 0;
        for (int i = maxIndex - 1; i >= 0; i--) {
            if (nums[i] == num)
                return i;
        }
        return index;
    }
}
