package 简单两个数组的交集;

import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int mink=0, maxk = 0, index = 0;
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        while (mink < nums1.length && maxk < nums2.length) {
            if (nums1[mink] == nums2[maxk]) {
                res[index++] = nums1[mink];
                mink++;
                maxk++;
            } else if (nums1[mink] < nums2[maxk]) {
                mink++;
            } else if (nums2[maxk] < nums1[mink]) {
                maxk++;
            }
        }
        return Arrays.copyOfRange(res, 0, index);

    }
}
