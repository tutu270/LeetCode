package 简单丢失的数字;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] a = {4, 1, 2, 1, 2};
        missingNumber(a);

    }

    public static int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= i ^ nums[i];
        }
        return res;
    }
}