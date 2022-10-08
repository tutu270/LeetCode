package 简单两个链表的第一个公共节点;


import java.util.HashMap;
import java.util.Map;

class ListNode {
      int val;
     ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
      }
  }
class Solution {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headB == null || headA == null) {
            return null;
        }
        Map<ListNode, ListNode> temp = new HashMap<>();
        while (headA != null) {
            temp.put(headA, headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (temp.get(headB) != null) {
                return temp.get(headB);
            }
            headB = headB.next;
        }
        return null;
    }
}