//package 最大二叉树;
//
//import javax.swing.tree.TreeNode;
//
//class Solution {
//    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
//        TreeNode node = new TreeNode(val);
//        TreeNode prev = null, cur = root;
//        while (cur != null && cur.val > val) {
//            prev = cur; cur = cur.right;
//        }
//        if (prev == null) {
//            node.left = cur;
//            return node;
//        } else {
//            prev.right = node;
//            node.left = cur;
//            return root;
//        }
//    }
//}