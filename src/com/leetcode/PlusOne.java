package com.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PlusOne {

    public static void main(String[] args) {
        // write your code here
        int[] result = plusOne(new int[]{9});
        System.out.println(Arrays.toString(result));
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
