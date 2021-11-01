package com.leetcode.medium;

import java.util.Stack;

public class ValidateStackSequences {
    public static void main(String[] args) {
        System.out.println(validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> result = new Stack<>();
        int index = 0;
        for (int i = 0; i < pushed.length; i++) {
            result.add(pushed[i]);
            while (!result.empty() && result.peek() == popped[index]) {
                result.pop();
                index++;
            }
        }
        return result.empty();
    }
}
