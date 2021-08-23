package com.leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        boolean result = isValid("{{{}]}");
        System.out.println(result);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentParanthesis = s.charAt(i);

            if (currentParanthesis == '{' || currentParanthesis == '(' || currentParanthesis == '[') {
                stack.push(currentParanthesis);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (currentParanthesis) {
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
