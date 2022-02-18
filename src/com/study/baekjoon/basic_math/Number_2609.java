package com.study.baekjoon.basic_math;


import java.util.Scanner;

public class Number_2609 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int d = gcd(a, b);

        System.out.println(d);
        System.out.println(a * b / d);

    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}