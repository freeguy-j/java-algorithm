package com.study.leetcode;

import java.util.Arrays;

public class Number_189 {
    public static void main(String[] args) {
//        rotate(new int[]{1,2,3,4,5,6,7}, 3);
//        rotate(new int[]{-1,-100,3,99}, 2);
        rotate(new int[]{1,2,3}, 2);
    }

    public static void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
    }
}
