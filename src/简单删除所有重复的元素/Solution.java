package 简单删除所有重复的元素;


import java.util.ArrayList;
import java.util.List;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (pre.val == cur.val) {
                cur = cur.next;
                continue;
            }
            pre.next = cur;
            cur = cur.next;
            pre = pre.next;

        }
        pre.next = null;
        return head;
    }
}