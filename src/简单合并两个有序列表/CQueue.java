package 简单合并两个有序列表;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

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
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);
        a.next = b;
        b.next = c;
        d.next = e;
        e.next = f;
        mergeTwoLists(a, d);

    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode res = new ListNode(0);
        ListNode temp  = res;
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            } else if (list2 == null) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            } else {
                if (list1.val > list2.val) {
                    temp.next = list2;
                    list2 = list2.next;
                    temp = temp.next;
                } else if (list1.val <= list2.val) {
                    temp.next = list1;
                    list1 = list1.next;
                    temp = temp.next;
                }
            }
        }
        return res.next;
    }
}