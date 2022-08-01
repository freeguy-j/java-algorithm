package com.study.leetcode;

public class Number_278 {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    static boolean isBadVersion(int version) {
        if (version >= 4) return true;
        return false;
    }

    public static int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) /2;
            if (isBadVersion(mid))
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
}
