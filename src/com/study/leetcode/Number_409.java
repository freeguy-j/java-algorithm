package com.study.leetcode;


import java.util.HashMap;

public class Number_409 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (hashMap.containsKey(a)) {
                hashMap.remove(a);
            } else {
                hashMap.put(a, 1);
            }
        }

        if (hashMap.size() == 0) {
            return s.length();
        } else {
            return s.length() - hashMap.size() + 1;
        }

    }
}
