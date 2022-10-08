package 中等最长优雅子数组;


class Solution {
    public static void main(String[] args) {
        int[] a = {744437702,379056602,145555074,392756761,560864007,934981918,113312475,1090,16384,33,217313281,117883195,978927664};
        longestNiceSubarray(a);
    }
    public static int longestNiceSubarray(int[] nums) {
        int res = 1;
        int value = nums.length - 1;
        int value1 = 0;
        int l = 0, r = nums.length - 1;
        if (nums.length == 0) {
            return 0;
        }
        while (l < r ) {
//            res = value - l + 1;
            if ((nums[l] & nums[r]) == 0) {
                res++;
                r--;
            } else if (r - l <= 1) {
                l++;
                r = value;
            } else {
                l = ++value1;
                r = --value;
                res = 1;

            }

        }
        return res;


    }
}

