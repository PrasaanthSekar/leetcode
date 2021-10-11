package com.leetcode.medium;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(2, 2));
    }

    public static int uniquePaths(int m, int n) {
        int[][] memo = new int[m + 1][n + 1];
        if (m == 1 || n == 1) return 1;
        if (m == 0 && n == 0) return 0;
        memo[m][n] = uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        return memo[m][n];
    }
}
