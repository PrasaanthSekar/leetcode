package com.leetcode.easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        // write your code here
        boolean result = isPalindrome("0P0");
        System.out.println(result);
    }

    public static boolean isPalindrome(String s) {
        String lowercase = s.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lowercase.length(); i++) {
            if (isValidCharacter(lowercase.charAt(i))) {
                result.append(lowercase.charAt(i));
            }
        }
        return result.toString().equals(result.reverse().toString());
    }

    private static boolean isValidCharacter(int character) {
        return (character >= 48 && character <= 57) || (character >= 97 && character <= 122);
    }
}
