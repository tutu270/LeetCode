package 移除元素;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        System.out.printf("66"+removeElement(a,2));
    }
    public static int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int res=0;
        for (int i = 0,j=0; i < nums.length; i++) {
            if (nums[i] == val) {
                res++;
            } else {
                nums[j++] = nums[i];
            }
        }
        return nums.length - res;

    }
}