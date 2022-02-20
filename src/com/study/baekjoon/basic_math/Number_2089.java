package com.study.baekjoon.basic_math;


import java.util.Scanner;

public class Number_2089 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "";
        int n = sc.nextInt();
        if (n == 0)  ans = "0";

        while (n != 0) {
            if (n % 2 == -1) {
                ans = (n % -2) + 2 + ans;
                n = (n / -2) + 1;
            } else {
                ans = (n % -2) + ans;
                n = (n / -2);
            }
        }
        System.out.print(ans);

    }

}