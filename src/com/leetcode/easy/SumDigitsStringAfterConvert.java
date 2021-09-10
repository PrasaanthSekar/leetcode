package com.leetcode.easy;

public class SumDigitsStringAfterConvert {

    public static void main(String[] args) {
        // write your code here
        int result = getLucky("zbax", 2);
        System.out.println(result);
    }

    public static int getLucky(String s, int k) {
        String main = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            number.append(main.indexOf(s.charAt(i)) + 1);
        }

        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < number.length(); j++) {
                sum += Integer.parseInt("" + number.charAt(j));
            }
            number.replace(0, number.length(), "" + sum);
        }
        return Integer.parseInt(number.toString());
    }
}
