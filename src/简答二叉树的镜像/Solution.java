package 简答二叉树的镜像;


import java.util.Stack;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();


            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left != null) stack.add(node.left);
            if(node.right != null) stack.add(node.right);

        }

        return root;
    }
}
