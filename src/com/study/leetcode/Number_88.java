package com.study.leetcode;

import java.util.Arrays;

public class Number_88 {
    public static void main(String[] args) {
//        rotate(new int[]{1,2,3,4,5,6,7}, 3);
//        rotate(new int[]{-1,-100,3,99}, 2);
        merge(new int[]{1,2,3,0,0,0},3, new int[]{2,5,6},3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);

    }
}
