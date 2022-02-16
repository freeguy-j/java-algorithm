package com.study.baekjoon.string;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Number_10808 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.next();
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < arr.length ; i++) {
            sb.append(str.length() - str.replaceAll(arr[i], "").length()).append(" ");
        }
        System.out.println(sb);
    }
}