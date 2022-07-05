package com.study.leetcode;


public class Number_21 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println(mergeTwoLists(list1, list2).toString());
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur = new ListNode();
        ListNode answer = cur;
        while (!(list1 == null && list2 == null)) {
            ListNode node;
            int val1 = (list1 != null ? list1.val : 101);
            int val2 = (list2 != null ? list2.val : 101);
            if (val1 < val2) {
                node = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                node = new ListNode(list2.val);
                list2 = list2.next;
            }

            cur.next = node;
            cur = cur.next;
        }
        return answer.next;
    }



}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
