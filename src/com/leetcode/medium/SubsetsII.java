package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetsII {
    public static void main(String[] args) {
        List<List<Integer>> result = subsetsWithDup(new int[]{1,2,3});
        System.out.println(result);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (Integer num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> temp = new ArrayList<>(result.get(i));
                temp.add(num);
                if (!result.contains(temp))
                    result.add(temp);
            }
        }

        return result;
    }
}
