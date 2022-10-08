package 简单特殊数组的特征值;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int specialArray(int[] nums) {
        int res = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i <= res; i++) {
            int temp = 0;
            for (int i1 = 0; i1 < nums.length; i1++) {
                if (nums[i1] >= i) {
                    temp++;
                }
            }
            if (temp == i) {
                return i;
            }
        }
        return -1;
    }
}