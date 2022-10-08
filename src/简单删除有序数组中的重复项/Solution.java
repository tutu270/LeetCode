package 简单删除有序数组中的重复项;

class Solution {
    public static void main(String[] args) {
        int[] a = {-1,0,0,0,0,3,3};
        removeDuplicates(a);
    }
    public static int removeDuplicates(int[] nums) {
        int l=0 , r = 0;
        int index =  1;
        int temp = nums[0];
        if (nums.length == 1) {
            return 1;
        }
        for (int i = 0; i <= nums.length-2; i++) {
            l = i;
            r = i + 1;
            while ((nums[l] == nums[r] || nums[l] > nums[r]) && r <= nums.length-2) {
                r++;

            }
            if (nums[l] < nums[r]) {
                nums[l + 1] = nums[r];
                if (temp < nums[r]) {
                    index++;
                    temp = nums[r];
                }

            }

        }
        return index;
    }
}