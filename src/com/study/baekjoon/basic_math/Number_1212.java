package com.study.baekjoon.basic_math;


import java.util.Scanner;

public class Number_1212 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int nlen = n.length();

        String[] arr ={"000", "001", "010", "011", "100", "101", "110", "111"};

        if (nlen == 1 && n.charAt(0) == '0') {
            System.out.println(n.charAt(0));
        }

        boolean start = true;
        for (int i = 0; i < nlen; i++) {
            int a = Integer.parseInt(n.charAt(i) + "");
            if (start && a < 4) {
                if (a == 0) {
                    continue;
                } else if (a == 1) {
                    System.out.print(a);
                } else if (a == 2) {
                    System.out.print("10");
                } else if (a == 3) {
                    System.out.print("11");
                }
                start = false;
            } else {
                System.out.print(arr[a]);
                start = false;
            }

        }
    }

}