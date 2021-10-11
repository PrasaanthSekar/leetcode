package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int len = nums.length;
        if(len == 0) return new ArrayList<>();
        int start = 0;
        int end = 0;
        while (end != len - 1) {
            if (nums[end] + 1 != nums[end + 1]) {
                boolean b = (nums[start] != nums[end]) ? result.add(nums[start] + "->" + nums[end]) : result.add("" + nums[end]);
                start = end + 1;
            }
            end++;
        }
        if (nums[start] != nums[end])
            result.add(nums[start] + "->" + nums[end]);
        else
            result.add("" + nums[end]);
        return result;
    }
}
