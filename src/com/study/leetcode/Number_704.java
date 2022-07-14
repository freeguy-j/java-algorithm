package com.study.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Number_704 {
    public static void main(String[] args) {
        int[] nums = {1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }


    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) return -1;

            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
