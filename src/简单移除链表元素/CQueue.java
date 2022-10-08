package 简单移除链表元素;

 class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c= new ListNode(6);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(5);
        ListNode g = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        removeElements(a, 6);
    }
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode res = new ListNode(0);
        ListNode p = res;
        while (head != null) {
            if (head.val == val) {
                p.next = head.next;
                head = head.next;
                continue;
            }
            p.next = head;
            head = head.next;
            p = p.next;
        }
        return res.next;
    }
}