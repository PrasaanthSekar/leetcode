package com.leetcode.medium;

import java.util.*;

public class CombinationSumII {
    public static void main(String[] args) {
//        combinationSum(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        combinationSum(new int[]{1, 2, 3}, 4);
    }

    private static void combinationSum(int[] ints, int i) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(ints);
        findCombo(ints, result, i, new ArrayList<Integer>(), 0);
        System.out.println(result);
    }

    // Without element duplicates
    private static void findCombo(int[] ints, List<List<Integer>> result, int target, ArrayList<Integer> list, int start) {
        if (target == 0) result.add(new ArrayList<>(list));
        if (target < 0) return;
        for (int i = start; i < ints.length; i++) {
            if (i > start && ints[i] == ints[i - 1]) continue;
            list.add(ints[i]);
            findCombo(ints, result, target - ints[i], list, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
