package com.study.baekjoon.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Number_1260_brushUp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        int[][] trunk = new int[1001][1001];
        boolean[] trunkChecked = new boolean[1001];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            trunk[x][y] = trunk[y][x] = 1;
        }

        dfs(n, trunk, trunkChecked, v);
        System.out.println();
        trunkChecked = new boolean[1001];
        bfs(n, trunk, trunkChecked, v);
    }
    private static void dfs(int n, int[][] trunk, boolean[] trunkChecked, int v) {
        trunkChecked[v] = true;
        System.out.print(v + " ");

        for (int i = 1; i <= n; i++) {
            if (trunk[v][i] == 1 && !trunkChecked[i]) {
                dfs(n, trunk, trunkChecked, i);
            }
        }
    }



    private static void bfs(int n, int[][] trunk, boolean[] trunkChecked, int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        trunkChecked[v] = true;
        System.out.print(v + " ");
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (trunk[poll][i] == 1 && !trunkChecked[i]) {
                    queue.offer(i);
                    trunkChecked[i] = true;
                    System.out.print(i + " ");

                }
            }
        }
    }


}