package com.study.baekjoon.basic;

import java.time.LocalDate;
import java.util.Scanner;

public class Number_1924 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(LocalDate.of(2007, a, b).getDayOfWeek().toString().substring(0,3));
    }
}
