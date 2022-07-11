package com.study.leetcode;


public class Number_392 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("b", "ahbgdc"));
    }

    public static boolean isIsomorphic(String s, String t) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < t.length(); i++) {
            if (index >= s.length()) {
                break;
            }
            String s1 = s.split("")[index];

            if (s1.equals(t.substring(i, i + 1))) {
                count++;
                index++;
            }
        }

        return count == s.length();
    }
}
