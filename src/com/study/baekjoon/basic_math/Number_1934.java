package com.study.baekjoon.basic_math;


import java.util.Scanner;

public class Number_1934 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();



        for (int i = 0 ; i < n ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int d = gcd(a, b);
            sb.append(a * b / d).append("\n");
        }

        System.out.println(sb);
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}