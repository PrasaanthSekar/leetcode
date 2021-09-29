package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int[][] dp = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
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
        List<Integer> temp = null;
        for (int i = 0; i < numRows; i++) {
            temp = new ArrayList<>();
            for (int j = 0; j < numRows; j++) {
                if (dp[i][j] != 0)
                    temp.add(dp[i][j]);
            }
            result.add(temp);
        }
        return result;
    }
}
