package 简单二叉树的后续排序;

import java.util.ArrayList;
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
    List<Integer> list = new ArrayList<>();


    public List<Integer> postorderTraversal(TreeNode root) {

        inorder(root);
        return list;
    }
    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        inorder(root.right);
        list.add(root.val);
    }

}