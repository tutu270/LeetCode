package 中等从上到下打印二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Queue<TreeNode> temp = new LinkedList<>();
        temp.offer(root);
        List<Integer> values = new ArrayList<>();
        while (!temp.isEmpty()) {
            TreeNode node = temp.poll();
            values.add(node.val);
            if (node.left != null) {
                temp.offer(node.left);
            }
            if (node.right != null) {
                temp.offer(node.right);
            }
        }
        int[] res = new int[values.size()];
        for (int i = 0; i < values.size(); i++) {
            res[i] = values.get(i);
        }
        return res;

    }
}