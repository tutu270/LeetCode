package 链表随机节点;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Solution {

    List<Integer> list;
    Random r ;
    public Solution(ListNode head) {
        list = new ArrayList<Integer>();
        r = new Random();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

    }

    public int getRandom() {
        return list.get(r.nextInt(list.size()));
    }
}

class ListNode {
    int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

