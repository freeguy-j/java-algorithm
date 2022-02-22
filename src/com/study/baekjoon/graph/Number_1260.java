package com.study.baekjoon.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Number_1260 {
    static int[][] check; //간선 연결상태
    static boolean[] checked; //확인 여부
    static int n; //정점개수
    static int m; //간선개수
    static int start; //시작정점
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        check = new int[1001][1001];
        checked = new boolean[1001];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            check[x][y] = check[y][x] = 1;
        }

        dfs(start);
        checked = new boolean[1001];
        System.out.println();

        bfs();
        System.out.println();

    }

    private static void dfs(int i) {
        checked[i] = true;
        System.out.print(i + " ");
        for (int j = 1; j <= n; j++) {
            if (check[i][j] == 1 && !checked[j]) {
                dfs(j);
            }
        }
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        checked[start] = true;
        System.out.print(start + " ");

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int i = 1; i <= n ; i++) {
                if (check[temp][i] == 1 && !checked[i]) {
                    queue.offer(i);
                    checked[i] = true;
                    System.out.print(i + " ");
                }
            }
        }

    }
}