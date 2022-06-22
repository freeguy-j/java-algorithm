package com.study.baekjoon.greedy;

import java.util.Scanner;

public class Number_5585 {
    static int[] costArr = {500, 100, 50, 10, 5, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = 1000 - sc.nextInt();

        int costCount = 0;
        for (int sellerCost : costArr) {
             costCount += cost / sellerCost;
             cost %= sellerCost;
        }

        System.out.println(costCount);
    }
}