package com.study.baekjoon.basic_math;


import java.util.Scanner;

public class Number_1373 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int nlen = n.length();

        if (nlen % 3 == 1) {
            System.out.print(n.charAt(0));
        }

        if (nlen % 3 == 2) {
            System.out.print((n.charAt(0) - '0') * 2 + (n.charAt(1) - '0'));
        }

        for (int i = nlen % 3 ; i < nlen ; i+=3) {
                System.out.print((n.charAt(i) - '0') * 4 + (n.charAt(i + 1) - '0') * 2 + (n.charAt(i + 2) - '0'));
        }
    }

}