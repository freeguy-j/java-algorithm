package com.study.baekjoon.string;

import java.util.Scanner;

public class Number_11655 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char[] arr = sc.nextLine().toCharArray();
        for (int i = 0; i < arr.length ; i++) {
            if ('a' <= arr[i] && arr[i] <= 'z') {
                if (arr[i] >= 'n') {
                    arr[i] -= 13;
                    sb.append(arr[i]);
                }else {
                    arr[i] += 13;
                    sb.append(arr[i]);
                }
            } else if ('A' <= arr[i] && arr[i] <= 'Z') {
                if (arr[i] >= 'N') {
                    arr[i] -= 13;
                    sb.append(arr[i]);
                }else {
                    arr[i] += 13;
                    sb.append(arr[i]);
                }
            } else {
                sb.append(arr[i]);
            }
        }
        System.out.println(sb);
    }
}