package com.study.leetcode;


public class Number_876 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(middleNode(list1).toString());
    }

    public static ListNode middleNode(ListNode head) {
        ListNode cur = new ListNode();
        ListNode answer = cur;
        int count = 0;
        while (head != null) {
            count++;
            cur.next = new ListNode(head.val);
            cur = cur.next;
            head = head.next;
        }
        count = (count / 2) + 1;

        while (count != 0) {
            count--;
            head = answer.next;
            answer = answer.next;
        }



        return head;
    }
}
