package com.leetcode.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PlusOne {

    public static void main(String[] args) {
        // write your code here
        int[] result = plusOneUpdate(new int[]{8, 9, 8});
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOneUpdate(int[] digits) {
        int len = digits.length;
        int[] plusOne = new int[len];
        int carry = 0;
        for (int i = len - 1; i >= 0; i--) {
            int sum = 0;
            if (i == len - 1) sum = digits[i] + 1;
            else sum = digits[i] + carry;
            if (sum > 9) {
                plusOne[i] = 0;
                carry = 1;
            } else {
                plusOne[i] = sum;
                carry = 0;
            }
            if (i == 0 && carry == 1) {
                plusOne = new int[len + 1];
                plusOne[0] = 1;
            }
        }
        return plusOne;
    }

    public static int[] plusOne(int[] digits) {
        int[] plusOne = new int[digits.length];
        boolean isFinished = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9 && !isFinished) {
                if (i == 0) {
                    int[] tenArray = new int[1];
                    tenArray[0] = 1;

                    return IntStream.concat(IntStream.of(tenArray), IntStream.of(plusOne)).toArray();
                } else {
                    plusOne[i] = 0;
                }
            } else if (digits[i] != 9 && !isFinished) {
                plusOne[i] = digits[i] + 1;
                isFinished = true;
            } else {
                plusOne[i] = digits[i];
            }
        }
        return plusOne;
    }
}
