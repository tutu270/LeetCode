package 简单在排序数组中查找数字1;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] a = {5,7,7,8,8,10};
        search(a, 6);

    }
    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int temp = -1;
        int res = 0;
        if (nums.length == 1 && nums[0] == target) {
            return  1;
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target < nums[mid]) {
                r = mid-1;
            }
            if (target > nums[mid]) {
                l = mid + 1;
            }
            if (target == nums[mid]) {
                temp = mid;
                res = 1;
                break;
            }
        }
        if (temp != -1) {
            for (int i = temp + 1; i < nums.length; i++) {
                if (nums[i] == target) {
                    res++;
                } else {
                    break;
                }

            }
            for (int i = temp - 1; i >= 0; i--) {

                if (nums[i] == target) {
                    res++;
                } else {
                    break;
                }

            }
        }
        return res;
    }
}