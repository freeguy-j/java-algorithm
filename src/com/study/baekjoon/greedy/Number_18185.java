package com.study.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_18185 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] ints = new int[N];
        for (int i = 0; i < N; i++) {
            ints[i] = Integer.parseInt(arr[i]);
        }


        int count = 0;
        for (int i = 0 ; i < N; i++) {
            if (i + 2 <= N - 1) {
                while (ints[i] != 0) {
                    if (ints[i] > 0 && ints[i+1] > 0 && ints[i+2] > 0) {
                        ints[i] = ints[i] - 1;
                        ints[i + 1] = ints[i+1] - 1;
                        ints[i + 2] = ints[i+2] - 1;
                        count += 7;
                        continue;
                    }

                    if (ints[i] > 0 && ints[i+1] > 0) {
                        ints[i] = ints[i] - 1;
                        ints[i + 1] = ints[i+1] - 1;
                        count += 5;
                        continue;
                    }

                    if (ints[i] > 0) {
                        ints[i] = ints[i] - 1;
                        count += 3;
                    } else {
                        break;
                    }
                }

            } else if (i + 1 <= N - 1) {
                while (ints[i] != 0) {
                    if (ints[i] > 0 && ints[i+1] > 0) {
                        ints[i] = ints[i] - 1;
                        ints[i + 1] = ints[i+1] - 1;
                        count += 5;
                        continue;
                    }

                    if (ints[i] > 0) {
                        ints[i] = ints[i] - 1;
                        count += 3;
                    } else {
                        break;
                    }
                }
            } else if (i == N - 1) {
                while (ints[i] != 0) {
                    if (ints[i] > 0) {
                        ints[i] = ints[i] - 1;
                        count += 3;
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.println(count);

    }
}