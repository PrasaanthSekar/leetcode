package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int result = removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println(result);
        String s = "this is my world";
        String []array = s.split(" ");
        System.out.println(array[array.length -1].length());
    }

    public static int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int element : nums) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        return map.size();
    }
}
