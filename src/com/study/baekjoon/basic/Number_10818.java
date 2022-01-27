package com.study.baekjoon.basic;


import java.util.Arrays;
import java.util.Scanner;

public class Number_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] integers = new int[n];
        for (int i = 0; i < n ; i++) {
            int a = scanner.nextInt();
            integers[i] = a;
        }
        Arrays.sort(integers);
        System.out.println(integers[0] + " " + integers[n-1]);
    }
}
