package 中等从上到下打印二叉树3;

import java.util.*;

/*
请实现一个函数按照之字形顺序打印二叉树，
 即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，
 第三行再按照从左到右的顺序打印，其他行以此类推。

 例如:
给定二叉树: [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

返回其层次遍历结果：

[
  [3],
  [20,9],
  [15,7]
]
 */
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
        Deque<TreeNode> deque = new LinkedList<>();
        boolean reverse = false;
        if (root == null) {
            return res;
        }
        deque.offer(root);
        while (!deque.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int length = deque.size();
            if (!reverse){
                for (int i = 0; i < length; i++) {
                    TreeNode node = deque.pollFirst();
                    temp.add(node.val);

                    if (node.left != null) {
                        deque.offerLast(node.left);
                    }
                    if (node.right != null) {
                        deque.offerLast(node.right);
                    }


                }
            }
            if (reverse) {
                for (int i = 0; i < length; i++) {
                    TreeNode node = deque.pollLast();
                    temp.add(node.val);
                    if (node.right != null) {
                        deque.offerFirst(node.right);
                    }
                    if (node.left != null) {
                        deque.offerFirst(node.left);
                    }
                }
            }
            res.add(temp);
            reverse = !reverse;

        }
        return res;

    }
}