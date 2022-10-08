package 中等最长的同值路径;



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {
    }
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int res;

    public int longestUnivaluePath(TreeNode root) {
        res = 0;
        dfs(root);
        return res;
    }

    public int dfs(TreeNode head) {
        if (head == null) {
            return 0;
        }
        int maxLeft = dfs(head.left), maxRight = dfs(head.right);
        int left = 0, right = 0;
        if (head.left != null && head.left.val == head.val) {
            left = maxLeft + 1;
        }
        if (head.right != null && head.right.val == head.val) {
            right = maxRight + 1;
        }

        res = Math.max(res, left + right);
        return Math.max(left, right);
    }
}

