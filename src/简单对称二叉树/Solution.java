package 简单对称二叉树;

class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : circle(root.left, root.right);
    }

    boolean circle(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return circle(left.left, right.right) && circle(left.right, right.left);
    }
}