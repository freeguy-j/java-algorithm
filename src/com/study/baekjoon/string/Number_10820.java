package com.study.baekjoon.string;

import java.util.Scanner;

public class Number_10820 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int small = 0;
            int big = 0;
            int num = 0;
            int space = 0;
            for (int i = 0; i < str.length(); i++) {
                char chr = str.charAt(i);
                if ('a' <= chr && chr <= 'z') {
                    small++;
                } else if ('A' <= chr && chr <= 'Z') {
                    big++;
                } else if (chr >= '0' && chr <= '9') {
                    num++;
                } else {
                    space++;
                }
            }
            sb.append(small).append(" ").append(big).append(" ").append(num).append(" ").append(space).append("\n");
        }
        System.out.println(sb);
    }
}