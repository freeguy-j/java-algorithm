package com.study.baekjoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number_1168 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 1 ; i <= n; i ++) {
            list.add(i);
        }

        int index = k - 1;
        while (true) {
            stringBuilder.append(list.get(index));
            list.remove(index);
            if (list.size() == 0) break;
            stringBuilder.append(", ");
            index += k - 1;
            index %= list.size();
        }
        System.out.println("<" + stringBuilder + ">");

    }
}