package com.study.baekjoon.basic;

import java.util.Scanner;

public class Number_2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
