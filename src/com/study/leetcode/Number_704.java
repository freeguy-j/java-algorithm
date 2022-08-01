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
        int pivot = 0;
        int left = 0;
        int right = nums.length -1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) return pivot;

            if (nums[pivot] >= target) left = pivot + 1;
            else right = pivot - 1;
        }
        return -1;
    }
}
