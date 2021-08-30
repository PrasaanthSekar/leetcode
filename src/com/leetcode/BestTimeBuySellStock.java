package com.leetcode;

public class BestTimeBuySellStock {

    public static void main(String[] args) {
        // write your code here
        int result = maxProfit1(new int[]{7,1,5,3,6,4});
        System.out.println(result);
    }

    public static int maxProfit1(int[] prices) {
        int min = Integer.MAX_VALUE, max = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            max = Math.max(price - min, max);
            if ((price - min) != max)
                max += Math.max(price - min, max);
        }
        return max;
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int index = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                index = i;
            }
        }
        int max = findMax(index, prices);
        return max == 0 ? 0 : max - min;
    }

    private static int findMax(int index, int[] prices) {
        int max = 0;
        if (index == prices.length - 1) {
            return 0;
        }
        for (int i = index; i < prices.length; i++) {
            if (prices[i] > max)
                max = prices[i];
        }
        return max;
    }
}
