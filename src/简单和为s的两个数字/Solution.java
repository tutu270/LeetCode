package 简单和为s的两个数字;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        if (nums.length == 1) {
            return ans;
        }
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if (nums[l] + nums[r] < target) {
                l++;
            } else if (nums[l] + nums[r] > target) {
                r--;
            } else {
                ans[0] = nums[l];
                ans[1] = nums[r];
                return ans;
            }
        }
        return ans;
    }
}