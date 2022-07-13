package com.study.leetcode;


public class Number_121 {
    public static void main(String[] args) {
        int[] list1 = {7,1,5,3,6,4};
        System.out.println(maxProfit(list1));
    }

    public static int maxProfit(int[] prices) {
        int answer = 0;
        int cur = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < cur) {
                cur = prices[i];
            }

            int sum = prices[i] - cur;
            if (sum > answer) {
                answer = sum;
            }
        }
        return answer;
    }
}
