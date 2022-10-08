package 中等二叉搜索树;

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
    boolean res = true;
    long preVal = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root.left == null && root.right == null) return true;
        dfs(root);
        return res;
    }

    void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        if (node.val <= preVal) res = false;
        preVal = node.val; // 保存上一次遍历时的值
        dfs(node.right);
    }
}