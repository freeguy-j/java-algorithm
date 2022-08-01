package com.study.leetcode;


import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Number_217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
    }
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                return true;
            } else {
                map.put(i, 0);
            }
        }
        return false;
    }



}