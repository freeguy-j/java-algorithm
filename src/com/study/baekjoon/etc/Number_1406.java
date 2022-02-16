package com.study.baekjoon.etc;

import java.util.Scanner;
import java.util.Stack;

public class Number_1406 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.next();
        int n = sc.nextInt();
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < str.length() ; i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0 ; i < n ; i++) {
            String command = sc.next();
            if (command.equals("P")) {
                if (stack.empty())
            } else if (command.equals("L")) {
                if (stack.empty()) break;
                stack.push(stack.pop())
            } else if (command.equals("D")) {
                if (cursor != str.length()) {
                    cursor += 1;
                }
            } else if (command.equals("B")) {
                if (cursor != 0) {
                    str = str.substring(0, cursor - 1) + str.substring(cursor, str.length());
                    cursor --;
                }
            }
        }
        System.out.println(str);
    }
}
