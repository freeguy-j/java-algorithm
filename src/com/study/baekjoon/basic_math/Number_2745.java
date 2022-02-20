package com.study.baekjoon.basic_math;


import java.util.Scanner;

public class Number_2745 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();

        int tmp = 1;
        int total = 0;
        for (int i = n.length() - 1 ; i >= 0 ; i--) {
            char chr = n.charAt(i);
            if (chr >= 'A' && chr <= 'Z') {
                total += (chr - 'A' + 10) * tmp;
            } else {
                total += (chr - '0') * tmp;
            }
            tmp *= b;
        }


        System.out.println(total);
    }

}