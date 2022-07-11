package com.study.leetcode;


public class Number_206 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(reverseList(list1).toString());
    }

    public static ListNode reverseList(ListNode head) {
        ListNode answer = null;
        while (head != null) {
            if (answer == null) {
                answer = new ListNode(head.val);
                head = head.next;
            } else {
                answer = new ListNode(head.val, answer);
                head = head.next;
            }
        }
        return answer;
    }
}
