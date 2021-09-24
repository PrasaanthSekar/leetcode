package com.leetcode.medium;

public class ShiftingLetters {
    public static void main(String[] args) {
        String result = shiftingLetters("ruu", new int[]{26, 20, 30});
        System.out.println(result);
    }

    public static String shiftingLetters(String s, int[] shifts) {
        StringBuilder result = new StringBuilder();
        int sum = 0;
        int deduction = 0;
        for (int shift : shifts) {
            sum += shift;
        }
        for (int i = 0; i < s.length(); i++) {
            int pos = s.charAt(i);
            if (i != 0) {
                deduction += shifts[i - 1];
                int newShift = sum - deduction;
                int posAdded = ((pos - 'a') + (newShift % 26));
                char newChar = (char) (posAdded);
                result.append(newChar);
            } else {
                char charEqual = (char) ('a' + (((pos - 'a') + sum) % 26));
                result.append(charEqual);
            }

        }
        return result.toString();
    }
}
