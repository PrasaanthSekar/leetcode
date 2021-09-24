package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        System.out.println(minimumTotal(triangle));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int[][] sums = new int[triangle.size()][triangle.size()];
        return findSum(triangle, 0, 0, sums);
    }

    private static int findSum(List<List<Integer>> triangle, int level, int index, int[][] sums) {
        if (level >= triangle.size() - 1) return triangle.get(level).get(index);
        if (sums[level][index] != 0) return sums[level][index];

        int leftSum = findSum(triangle, level + 1, index, sums);
        int rightSum = findSum(triangle, level + 1, index + 1, sums);
        sums[level][index] = triangle.get(level).get(index) +
                Math.min(
                        leftSum, rightSum
                );

        return sums[level][index];
    }
}
