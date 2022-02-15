package com.study.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class Number_9012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(solve(sc.next()));
        }
    }

    private static String solve(String next) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < next.length(); i++) {
            char str = next.charAt(i);
            if (str == '(') {
                stack.push(str);
            } else if (stack.isEmpty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}