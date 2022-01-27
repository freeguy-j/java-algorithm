package com.study.baekjoon.basic;

import java.util.Scanner;

public class Number_10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (!scanner.hasNext()) {
                break;
            }
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}
