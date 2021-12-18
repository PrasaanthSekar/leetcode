package com.leetcode.easy;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int free = 0;
        int len = flowerbed.length;
        if (len == 1 && flowerbed[0] == 0) n--;
        else {
            for (int i = 0; i < len; i++) {
                if (i == 0 && flowerbed[i] == 0) {
                    if (flowerbed[i + 1] == 0) {
                        n--;
                        flowerbed[0] = 1;
                    }
                } else if (i == len - 1 && flowerbed[len - 1] == 0) {
                    if (flowerbed[i - 1] == 0) {
                        n--;
                        flowerbed[len - 1] = 1;
                    }
                } else if (flowerbed[i] == 0) {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        n--;
                        flowerbed[i] = 1;
                    }
                }
            }
        }
        return n <= 0;
    }
}
