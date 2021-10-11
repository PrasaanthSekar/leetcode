package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        // write your code here
        List<List<Integer>> result = subsets(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> list = new ArrayList<>(result.get(i));
                list.add(num);
                result.add(list);
            }
        }

        return result;
    }
}
