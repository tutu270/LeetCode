package 简单二叉树的前序排序;

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

//class Solution {
//    List<Integer> list = new ArrayList<>();
//    Deque<TreeNode> temp = new LinkedList<>();
//
//    public List<Integer> preorderTraversal(TreeNode root) {
//
//        inorder(root);
//        return list;
//    }
//    public void inorder(TreeNode root) {
//        temp.offer(root);
//        if (r)
//        list.add(root.val);
//        inorder(root.left);
//        inorder(root.right);
//    }
//
//}