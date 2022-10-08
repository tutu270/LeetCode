package 最大子数组和;

import java.util.Arrays;

class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int value : nums) {
            if (sum > 0) {
                sum += value;
            } else {
                sum = value;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}