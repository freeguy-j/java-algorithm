package com.study.baekjoon.basic;

import java.util.Scanner;

public class Number_10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a + b == 0) {
                scanner.close();
                break;
            }
            System.out.println(a + b);
        }
    }
}
