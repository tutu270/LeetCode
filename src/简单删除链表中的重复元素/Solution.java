package 简单删除链表中的重复元素;


class Solution {
    public static void main(String[] args) {
        ListNode listNod0 = new ListNode(1);
        ListNode listNod1 = new ListNode(2);
        ListNode listNod2 = new ListNode(3);
        ListNode listNod3 = new ListNode(4);
        ListNode listNod4 = new ListNode(5);
        listNod0.next = listNod1;
        listNod1.next = listNod2;
        listNod2.next = listNod3;
        listNod3.next = listNod4;
        deleteDuplicates(listNod0);
    }
    public static ListNode deleteDuplicates(ListNode head) {


        ListNode current = head;
        while (current.next != null && current.next.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;

            } else {
                current = current.next;
            }


        }
        return head;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
