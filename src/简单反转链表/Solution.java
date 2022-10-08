package 简单反转链表;


import java.util.ArrayList;
import java.util.List;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        reverseList(a);
    }
    public static ListNode reverseList(ListNode head) {
        ListNode current = head;

        ListNode res = null;
        ListNode pre = null;
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode next = head.next;

        while (next.next != null) {
            pre = next;
            next = next.next;
            res = pre;
            res.next = current;
            current = res;

        }
        res = next;
        res.next = current;
        current = res;

        return current;
    }
}