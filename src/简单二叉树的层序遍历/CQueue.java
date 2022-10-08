package 简单二叉树的层序遍历;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
  }

class Solution {

    List<List<Integer>> res = new ArrayList<>();
    Deque<TreeNode> temp = new LinkedList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {


        return circle(root);
    }

    public List<List<Integer>> circle(TreeNode root) {
        if (root == null) {
            return res;
        }
        temp.offer(root);

        while (!temp.isEmpty()) {
            int n = temp.size();

            List<Integer> list1 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = temp.poll();
                list1.add(node.val);
                if (node.left != null) {
                    temp.offer(node.left);
                }
                if (node.right != null) {
                    temp.offer(node.right);
                }
            }
            res.add(list1);
        }
        return res;
    }
}