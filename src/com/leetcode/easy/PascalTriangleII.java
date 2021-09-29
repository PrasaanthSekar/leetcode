package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public static void main(String[] args) {
        System.out.println(getRow(2));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        int[][] dp = new int[rowIndex + 1][rowIndex + 1];
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i == 0)
                    dp[i][j] = 1;
                else if (i == 1) {
                    dp[1][0] = 1;
                    dp[1][1] = 1;
                } else {
                    if (j == 0 || j == i) {
                        dp[i][0] = 1;
                        dp[i][i] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                    }
                }
            }
        }
        for (int i = 0; i < rowIndex + 1; i++) {
            result.add(dp[rowIndex][i]);
        }
        return result;
    }
}
