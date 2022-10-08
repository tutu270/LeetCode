package 简单删除链表节点;



 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Solution {
    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(9);
        a.next = b;
        b.next = c;
        c.next = d;
        deleteNode(a, 1);
    }
    public static ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode pre = new ListNode(0);
        ListNode res = pre;
        while (current != null) {

            if (current.val == val) {
                res.next = current.next;
                current = current.next;
            } else {
                res.next = current;
                res = res.next;
                current = current.next;
            }

        }
        return pre.next;
    }

}