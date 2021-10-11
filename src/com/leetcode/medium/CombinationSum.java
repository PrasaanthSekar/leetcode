package com.leetcode.medium;

import java.util.*;

public class CombinationSum {

    public static void main(String[] args) {
        combinationSum(new int[]{1, 2, 3}, 4);
    }


    private static void combinationSum(int[] ints, int i) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(ints);
        findCombo(ints, result, i, new ArrayList<Integer>(), 0);
        System.out.println(result);
    }

    // With element duplicates
    private static void findCombo(int[] ints, Set<List<Integer>> result, int target, ArrayList<Integer> list, int start) {
        if (target == 0) result.add(new ArrayList<>(list));
        if (target < 0) return;
        for (int i = start; i < ints.length; i++) {
//            if (i > start && ints[i] == ints[i - 1]) continue;
            list.add(ints[i]);
            findCombo(ints, result, target - ints[i], list, i);
            list.remove(list.size() - 1);
        }
    }


//    public static void combinationSum(int[] candidates, int target) {
//        List<List<Integer>> result = new ArrayList<>();
//        findComboMemo(candidates, target, result, new ArrayList<>(), 0);
//        System.out.println(result);
//    }
//
//    private static void findComboMemo(
//            int[] candidates,
//            int target,
//            List<List<Integer>> result,
//            List<Integer> memo, int start
//    ) {
//        if (target == 0) result.add(new ArrayList<>(memo));
//        if (target < 0) return;
//        for (int i = start; i < candidates.length; i++) {
//            memo.add(candidates[i]);
//            findComboMemo(candidates, target - candidates[i], result, memo, start);
//            memo.remove(memo.size() - 1);
//        }
//    }
}
