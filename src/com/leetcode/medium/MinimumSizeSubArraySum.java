package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int size = Integer.MAX_VALUE;
        findCombo(result, target, nums, 0, new ArrayList<>(), size);
        for (List<Integer> list : result){
            size = Math.min(size, list.size());
        }
        return (size == Integer.MAX_VALUE) ? 0 : size;
    }

    private static void findCombo(List<List<Integer>> result, int target, int[] nums, int start, ArrayList<Object> list, int size) {
        if (target == 0) {
            result.add(new ArrayList(list));
        }
        if (target < 0) return;
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            findCombo(result, target - nums[i], nums, start + 1, list, size);
            list.remove(list.size() - 1);
        }
    }
}
