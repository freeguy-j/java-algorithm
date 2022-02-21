package com.study.baekjoon.basic_math;


import java.util.Scanner;

public class Number_2004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();

        long cnt5 = five(n) - five(n - m) - five(m);
        long cnt2 = two(n) - two(n - m) - two(m);

        System.out.println(Math.min(cnt5, cnt2));
    }

    private static long five(long n) {
        int count = 0;
        while (n >= 5) {
            count += (n / 5);
            n /= 5;
        }
        return count;
    }

    private static long two(long n) {
        int count = 0;
        while (n >= 2) {
            count += (n / 2);
            n /= 2;
        }
        return count;
    }
}