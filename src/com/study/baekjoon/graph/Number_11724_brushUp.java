package com.study.baekjoon.graph;

import java.util.Scanner;

public class Number_11724_brushUp {
    static int[][] trunk;
    static boolean[] trunkChecked;
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        trunk = new int[1001][1001];
        trunkChecked = new boolean[1001];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            trunk[x][y] = trunk[y][x] = 1;
        }

        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (!trunkChecked[i]) {
                dfs(i);
                total ++;
            }
        }
        System.out.println(total);
    }

    private static void dfs(int i) {
        if (trunkChecked[i]) {
            return;
        } else {
            trunkChecked[i] = true;
            for (int j = 1; j <= n; j++) {
                if (trunk[i][j] == 1) {
                    dfs(j);
                }
            }
        }

    }


}