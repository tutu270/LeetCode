package 简单合并两个排序的链表;


 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode node = new ListNode(0);
        ListNode temp = node;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                temp.next = l2;
                return node.next;
            } else if (l2 == null) {
                temp.next = l1;
                return node.next;
            } else {
                if (l1.val < l2.val) {

                    temp.next = l1;
                    temp = temp.next;
                    l1 = l1.next;
                } else {
                    temp.next = l2;
                    temp = temp.next;
                    l2 = l2.next;
                }
            }
        }
        return node.next;
    }
}