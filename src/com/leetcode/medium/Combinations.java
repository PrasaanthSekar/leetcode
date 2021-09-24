package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        List<List<Integer>> result = combine(1, 1);
        System.out.println(result);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                List<Integer> combi = new ArrayList<>();
                if (i != j) {
                    combi.add(i);
                    combi.add(j);
                    result.add(combi);
                }

            }
        }
        return result;
    }
}
