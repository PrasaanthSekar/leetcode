package com.leetcode.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write an algorithm to determine if a number n is happy.
 * <p>
 * A happy number is a number defined by the following process:
 * <p>
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 */
public class HappyNumber {
    public static void main(String[] args) {
        // write your code here
        boolean result = isHappy(19);
        System.out.println(result);
    }

    public static boolean isHappy(int n) {
        Set<Integer> list = new HashSet<>();
        if (n == 1) return true;
        while (list.add(n)) {
            int square = 0;
            while (n > 1) {
                int temp = n % 10;
                square += temp * temp;
                n = n / 10;
                if (n == 1)
                    square += 1;
            }
            if (square == 1)
                return true;
            else if (square > 1)
                n = square;
        }
        return false;
    }
}
