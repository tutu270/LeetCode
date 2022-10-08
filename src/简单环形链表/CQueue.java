package 简单环形链表;


import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
      }
  }

// class Solution {
//    public boolean hasCycle(ListNode head) {
//        Set<ListNode> set = new HashSet<>();
//        ListNode temp = head;
//        while (temp != null) {
//            if (set.contains(temp)) {
//                return true;
//            }
//            set.add(temp);
//            temp = temp.next;
//        }
//
//        return false;
//
//    }
//}
class Solution {
    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(-4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;
        hasCycle(a);
    }
    public static boolean hasCycle(ListNode head) {
        if(head==null){return false;}
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast.next != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;

            if(slow == fast){
                return true;
            }
        }
        return false;


    }
}