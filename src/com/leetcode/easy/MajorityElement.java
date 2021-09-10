package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ and [n/3]times. You may assume that the majority element always exists in the array.
 */
public class MajorityElement {

    public static void main(String[] args) {
        // write your code here
        int result = majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        List<Integer> result1 = majorityElement1(new int[]{2, 2});
        System.out.println(result);
        System.out.println(result1);
    }


    public static List<Integer> majorityElement1(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int count = 0;
        int curr = nums[0];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == curr) {
                count++;
            } else {
                count = 1;
                curr = nums[i];
            }
            if (count > length / 3 && !result.contains(nums[i]))
                result.add(nums[i]);
        }
        return result;
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int curr = nums[0];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == curr) {
                count++;
            } else {
                count = 1;
                curr = nums[i];
            }
            if (count > length / 2)
                return nums[i];
        }
        return 0;
    }
}
