package 简单连续子数组的最大和;

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[2];
        dp[0] = nums[0];
        dp[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[0] = Math.max(dp[0] + nums[i], nums[i]);
            dp[1] = Math.max(dp[1], dp[0]);
        }
        return dp[1];
    }
}