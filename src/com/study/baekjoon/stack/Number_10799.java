package com.study.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class Number_10799 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (chr == '(') {
                stack.push(chr);
            } else if (chr == ')') {
                stack.pop();
                if (str.charAt(i-1) == '(') {
                    result += stack.size();
                } else {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}