package 简单数组中的重复数字;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> temp = new HashMap<>();
        int res =0;
        for (int i = 0; i < nums.length; i++) {
            int count = temp.getOrDefault(nums[i], 0) + 1;
            if (count > 1) {
                res = nums[i];
            } else {
                temp.put(nums[i], count);
            }
        }
        return res;
    }
}