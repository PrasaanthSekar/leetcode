package com.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        // write your code here
        int result = reverse(-123);
        System.out.println(result);
    }

    public static int reverse(int x) {
        int newNumber = Math.abs(x);
        int reversedNumber = 0;
        while(newNumber > 0){
            int balance = newNumber % 10;
            newNumber = newNumber / 10;
            reversedNumber = (reversedNumber * 10) + balance;
        }
        System.out.println(Integer.MAX_VALUE);
        if(x < 0){
            return -reversedNumber;
        }else{
            return reversedNumber;
        }
    }
}
