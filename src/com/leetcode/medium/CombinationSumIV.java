package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIV {
    public static void main(String[] args) {
        System.out.println(combinationSum4(new int[]{1, 2, 3}, 4));
    }

    public static int combinationSum4(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int count = 0;
        findCombo(nums, result, target, new ArrayList<Integer>(), 0, count);
        System.out.println(result);
        return count;
    }

    private static void findCombo(int[] ints, List<List<Integer>> result, int target, ArrayList<Integer> list, int start, int count) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
        }
        if (target < 0) return;
        for (int i = start; i < ints.length; i++) {
            list.add(ints[i]);
            findCombo(ints, result, target - ints[i], list, i, count);
            list.remove(list.size() - 1);
        }
    }
}
