package 简单搜索插入位置;


class Solution {
    public static void main(String[] args) {
        int[] a = {1,3};
        searchInsert(a, 2);
    }
    public static int searchInsert(int[] nums, int target) {
        int middle, res = 0;
        int left, right;
        if (nums.length % 2 == 0) {
            middle = (nums.length / 2) - 1;
        } else {
            middle = (nums.length / 2);
        }
        if (nums.length == 1) {
            if (nums[0] >= target) {
                res = 0;
            } else {
                res = 1;
            }
        }
        if (nums[middle] == target) {
            res = middle;
        }
        if (nums[middle] < target) {
            for (left = middle ; left < nums.length - 1; left++) {
                right = left + 1;
                if (nums[left] == target) {
                    res = left;
                    break;
                }
                if (nums[right] == target) {
                    res = right;
                    break;
                }
                if (nums[left] < target && nums[right] > target) {
                    res = right;
                    break;
                }
                if (target > nums[right] && right == nums.length - 1) {
                    res = right + 1;
                }
            }
        } else {
            for (left = middle -1; left >= 0; left--) {
                right = left + 1;
                if (nums[left] == target) {
                    res = left;
                    break;
                }
                if (nums[right] == target) {
                    res = right;
                    break;
                }
                if (nums[left] < target && nums[right] > target) {
                    res = right;
                    break;
                }
                if (target < nums[left] && left == 0) {
                    res = left;
                }
            }
        }
        return res;
    }
}