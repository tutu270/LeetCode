package 合并两个有序数组;

class Solution {
    public static void main(String[] args) {
        int[] abacus = {1, 2, 3, 0, 0, 0};
        int[] b = {2, 5, 6};
        merge(abacus,3,b,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = 0, r = 0, index = 0;
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }else {
            int[] temp = new int[nums1.length];
            while (index < nums1.length) {
                if (l >= m) {
                    temp[index++] =  nums2[r++];
                } else if (r >= n) {
                    temp[index++] = nums1[l++];
                } else {
                    temp[index++] = nums1[l] < nums2[r] ? nums1[l++] : nums2[r++];
                }
            }
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = temp[i];
            }
        }


    }
}