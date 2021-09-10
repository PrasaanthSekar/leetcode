package com.leetcode.arrays;

import java.util.*;

public class DisapppearingNumbers {

    public static void main(String[] args) {
        // write your code here
        List<Integer> result = findDisappearedNumbers(new int[]{1,1});
        System.out.println(result);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

//        List<Integer> list = new ArrayList<Integer>(set);
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i))
                res.add(i);
        }

        return res;
    }
}
