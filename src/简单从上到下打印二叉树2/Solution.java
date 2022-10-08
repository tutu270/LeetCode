package 简单从上到下打印二叉树2;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = deque.size(); i > 0; i--) {
                TreeNode deque1 = deque.poll();
                list.add(deque1.val);
                if (deque1.left != null) {
                    deque.offer(deque1.left);
                }
                if (deque1.right != null) {
                    deque.offer(deque1.right);
                }
            }
            res.add(list);

        }
        return res;
    }
}