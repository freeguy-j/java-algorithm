package com.study.leetcode;


public class Number_205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
    }

    public static boolean isIsomorphic(String s, String t) {

        while (s.length() > 0) {
            String s1 =  s.substring(0, 1);
            String t1 =  t.substring(0, 1);

            while (true) {
                int sIndex = s.indexOf(s1); // o
                int tIndex = t.indexOf(t1); // r
                if (sIndex == -1 && tIndex == -1) {
                    break;
                }

                if (sIndex != tIndex) {
                    return false;
                } else {
                    s = s.substring(0,sIndex) + s.substring(sIndex+1);
                    t = t.substring(0,tIndex) + t.substring(tIndex+1);
                }
            }
        }
        return true;
    }
}
