package com.leetcode.easy;

public class MaximumHeightTree {

    public static void main(String[] args) {
        System.out.println(height(6));
    }

    static int height(int N){
        // code here
        if(N == 1) return 2;
        if(N == 2) return 2;
        int height = 0;
        int sum = 0;
        for(int i = 1; i<=N; i++){
            sum+=i;
            if(N-sum >= 0){
                height++;
            }
        }
        return height;
    }
}
