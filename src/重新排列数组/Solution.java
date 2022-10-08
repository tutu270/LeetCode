package 重新排列数组;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] n = {3, 4};
        findMedianSortedArrays(a, n);

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length + nums2.length];
        int index = 0;
        double res = 0;
        int x = 0, y = 0;
        while (index < num.length) {

            if (x >= nums1.length ) {
                num[index++] = nums2[y++];

            } else if (y >= nums2.length ) {
                num[index++] = nums1[x++];
            } else  {
                num[index++] = nums1[x] < nums2[y] ? nums1[x++] : nums2[y++];
            }

        }

        if (index % 2 == 0) {
            res = (double) (num[index / 2] + num[(index / 2) - 1])/2;
            return res;
        } else {
            res = (double) num[(index / 2) ];
            return res;
        }
    }
}