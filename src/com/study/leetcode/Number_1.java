package com.study.leetcode;

public class Number_1 {
    public static void main(String[] args) {
//        rotate(new int[]{1,2,3,4,5,6,7}, 3);
//        rotate(new int[]{-1,-100,3,99}, 2);
        twoSum(new int[]{3,2,3}, 6);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; i < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
