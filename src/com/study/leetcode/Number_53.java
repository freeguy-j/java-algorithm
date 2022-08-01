package com.study.leetcode;


import java.util.LinkedHashMap;
import java.util.Map;

public class Number_53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sub = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            sub = Math.max(num, sub + num);
            max = Math.max(max, sub);
        }
        return max;
    }



}