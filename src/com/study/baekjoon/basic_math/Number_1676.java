package com.study.baekjoon.basic_math;


import java.util.Scanner;

public class Number_1676 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int zeroCount = 0;
        while (n >= 5) {
            zeroCount += n / 5;
            n = n / 5;
        }
        System.out.println(zeroCount);
    }

}