package 简单调整数组顺序使奇数位位于偶数位前面;


class Solution {
    public int[] exchange(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums;
        }
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if (nums[r] % 2 != 0 && nums[l] % 2 == 0) {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
                r--;
            } else if (nums[r] % 2 != 0 && nums[l] % 2 != 0) {
                l++;
            } else if (nums[r] % 2 == 0) {
                r--;
            }

        }
        return nums;
    }
}