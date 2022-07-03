package com.study.leetcode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Number_1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }


    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] + sum;
            sum += nums[i];
        }
        return  result;
    }
}
