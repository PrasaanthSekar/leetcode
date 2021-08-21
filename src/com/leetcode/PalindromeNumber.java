package com.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        // write your code here
        boolean result = isPalindrone(2341);
        System.out.println(result);
    }

    private static boolean isPalindrone(int x) {
        int newNumber = x;
        int reversedNumber = 0;
        while(newNumber > 0){
            int balance = newNumber % 10;
            newNumber = newNumber / 10;
            reversedNumber = (reversedNumber * 10) + balance;
        }
        return reversedNumber == x;
    }
}
