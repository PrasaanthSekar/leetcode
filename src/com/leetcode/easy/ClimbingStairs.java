package com.leetcode.easy;

import java.math.BigInteger;
import java.util.HashMap;

public class ClimbingStairs {

    public static void main(String[] args) {
        // write your code here
//        int result = climbStairs1(35);
        int result = climbStairs(45);
        System.out.println(result);
    }

    private static int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climbStairsMemo(n, memo);
    }


    private static int climbStairsMemo(int stairs, int[] memo) {
        if (memo[stairs] != 0) return memo[stairs];
        if (stairs == 1) return 1;
        if (stairs == 2) return 2;
        if (stairs < 1) return 0;
        memo[stairs] = climbStairsMemo(stairs - 1, memo) + climbStairsMemo(stairs - 2, memo);
        return memo[stairs];
    }

    public static int climbStairs1(int n) {
        int maxTwo = n / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(2, maxTwo);
        map.put(1, n % 2);
        BigInteger result = BigInteger.valueOf(0);
        while (map.get(2) > 0) {
            BigInteger num = getCombination(map.get(2) + map.get(1));
            BigInteger den1 = getCombination(map.get(2));
            BigInteger den2 = getCombination(map.get(1));
            result = result.add(num.divide(den1.multiply(den2)));
            map.put(2, map.get(2) - 1);
            map.put(1, map.get(1) + 2);
        }
        return result.intValue() + 1;
    }

    private static BigInteger getCombination(Integer n) {
        BigInteger value = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++)
            value = value.multiply(BigInteger.valueOf(i));
        return value;
    }


    public static int climbStairs2(int n) {
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = 1;

        if (n == 1)
            return 1;

        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }
}
