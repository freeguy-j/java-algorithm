package com.study.baekjoon.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Number_11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        String[] a1 = a.split("");
        String[] b1 = b.split("");
        int sum = 0;
        sum += Arrays.stream(b1).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);

    }
}
