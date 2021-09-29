package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        List<List<Integer>> result = permute(new int[]{1, 2, 3});
        System.out.println(result);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        return findAllPermutation(result, nums, 0);
    }

    private static List<List<Integer>> findAllPermutation(List<List<Integer>> result, int[] nums, int start) {
            if (start == nums.length - 1) {
            List<Integer> temp = new ArrayList<>();
            for (Integer num : nums)
                temp.add(num);
            result.add(temp);
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            findAllPermutation(result, nums, start + 1);
            swap(nums, i, start);
        }
        return result;
    }

    private static void swap(int[] nums, int i, int start) {
        if(start < nums.length) {
            int temp = nums[i];
            nums[i] = nums[start];
            nums[start] = temp;
        }
    }
}
