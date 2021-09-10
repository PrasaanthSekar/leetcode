package com.leetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateZeros {

    public static void main(String[] args) {
        // write your code here
        duplicateZeros(new int[]{0, 0, 0, 0, 0, 0});
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                shift(i + 1, arr);
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int[] shift(int i, int[] arr) {
        for (int j = arr.length - 2; j >= i; j--) {
            arr[j + 1] = arr[j];
        }
        arr[i] = 0;
        return arr;
    }

    public boolean checkIfExist(int[] arr) {
        Set<Integer> res = new HashSet();
        for(int i = 0; i< arr.length; i++){
            res.add(arr[i]);
            if(res.contains(arr[i]*2) || (arr[i] % 2 == 0 && res.contains(arr[i]/2))){
                return true;
            }
        }
        return false;
    }
}
