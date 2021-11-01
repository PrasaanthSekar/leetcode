package com.leetcode.medium;

import java.util.Stack;

public class MinimumAddMakeParenthesesValid {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid1("()))(("));
    }

    public static int minAddToMakeValid(String s) {
        while (s.contains("()")) {
            s = s.replace("()", "");
        }
        return s.length();
    }

    public static int minAddToMakeValid1(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) stack.add(s.charAt(i));
            else if (stack.peek() == '(' && s.charAt(i) == ')') stack.pop();
            else stack.add(s.charAt(i));
        }
        return stack.size();
    }
}
