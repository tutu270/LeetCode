package 简单从头到尾打印列表;


import java.util.ArrayList;
import java.util.List;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> s = new ArrayList<Integer>();
        ListNode current = head;
        if (current == null) {
            return new int[0];
        }
        while (current.next != null) {
            s.add(current.val);
            current = current.next;
        }
        s.add(current.val);
        int[] a = new int[s.size()];
        for (int i = 0; i < s.size(); i++) {
            a[i] = s.get(s.size() - i - 1);
        }
        return a;
    }
}