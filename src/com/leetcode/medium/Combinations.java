package com.leetcode.medium;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        List<List<Integer>> result = combine(3, 2);
        System.out.println(result);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int[] array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[i - 1] = i;
        }
        findCombo(array, result, 0, k);
        return result;
    }

    private static void findCombo(int[] array, List<List<Integer>> result, int start, int k) {
        if (start == array.length) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 2; i++) {
                list.add(array[i]);
            }
            result.add(list);
        }

        for (int i = start; i < array.length; i++) {
            swap(array, i, start);
            findCombo(array, result, start + 1, k);
            swap(array, i, start);
        }
    }

    private static void swap(int[] array, int i, int start) {
        int temp = array[i];
        array[i] = array[start];
        array[start] = temp;
    }
}
