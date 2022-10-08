package 简单将有序数组转换为二叉搜索树;




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
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = 0, r = nums.length - 1;
        return extracted(nums, l, r);
    }


    private TreeNode extracted(int[] nums, int left, int rights) {
        if (left > rights) {
            return null;
        }
        int mid = (left + rights) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = extracted(nums,left,mid-1);
        root.right = extracted(nums, mid + 1, rights);
        return root;

    }
}