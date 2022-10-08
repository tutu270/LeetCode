package 中等二叉搜索树中的插入操作;

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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        TreeNode temp = root;
        if (temp == null) {
            return node;
        }
        while (temp != null) {

            if (temp.left == null && temp.right == null) {
                if (temp.val > node.val) {
                    temp.left = node;
                } else {
                    temp.right = node;
                }

                return root;
            }

            if (temp.left == null && temp.val > node.val) {
                temp.left = node;
                return root;
            }
            if (temp.right == null && temp.val <= node.val) {
                temp.right = node;
                return root;
            }
            temp = temp.val < node.val ? temp.right : temp.left;
        }
        return root;

    }
}