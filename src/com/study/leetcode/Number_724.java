package com.study.leetcode;

import java.util.Arrays;

public class Number_724 {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }


    public static int pivotIndex(int[] nums) {

        int length = nums.length;
        for (int i = 0; i < length; i++) {

            int right = 0;
            for (int j = i + 1; j < length; j++) {
                right += nums[j];
            }

            int left = 0;
            for (int k = i - 1; k >= 0; k--) {
                left += nums[k];
            }

            if (right == left) {
                return i;
            }
        }
        return -1;
    }
}
