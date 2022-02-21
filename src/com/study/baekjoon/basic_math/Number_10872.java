package com.study.baekjoon.basic_math;


import java.util.Scanner;

public class Number_10872 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.print(factorial);

    }

}