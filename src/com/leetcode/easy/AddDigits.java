package com.leetcode.easy;

public class AddDigits {
    public static void main(String[] args) {
        // write your code here
        int result = addDigits(0);
        System.out.println(result);
    }

    public static int addDigits(int num) {
//        if (num < 10)
//            return num;
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            num = num / 10;
            sum += temp;
        }
        if (sum < 10)
            return sum;
        else
            return addDigits(sum);
    }
}
