package 中等复杂链表复制;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
class Solution {


    public Node copyRandomList(Node head) {
        Map<Node,Node> res = new HashMap<>();
        Node current = head;
        if (head == null) {
            return null;
        }
        while (current != null) {
            Node temp = new Node(current.val);
            res.put(current, temp);
            current = current.next;
        }
        current = head;
        while (current != null) {
            res.get(current).next = res.get(current.next);
            res.get(current).random = res.get(current.random);
            current = current.next;

        }

        return res.get(head);
    }

}