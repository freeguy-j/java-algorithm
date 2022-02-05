package com.study.baekjoon.dp;


import java.util.Scanner;

public class Number_11053_Bottom_Up {

    static int[] arr;
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n];
        count = 1;

        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i-1]) count++;
        }

        System.out.println(count);
    }
}